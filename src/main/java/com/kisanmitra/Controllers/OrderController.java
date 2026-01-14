package com.kisanmitra.Controllers;

import com.kisanmitra.models.*;
import com.kisanmitra.repositories.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    private final OrderRepository orderRepo;
    private final BuyerProfileRepository buyerRepo;
    private final FarmerListingRepository listingRepo;

    public OrderController(OrderRepository orderRepo,
                           BuyerProfileRepository buyerRepo,
                           FarmerListingRepository listingRepo) {
        this.orderRepo = orderRepo;
        this.buyerRepo = buyerRepo;
        this.listingRepo = listingRepo;
    }

    // Place order
    @PostMapping
    public Order placeOrder(@RequestBody OrderRequest request) {

        BuyerProfile buyer = buyerRepo.findById(request.getBuyerId())
                .orElseThrow(() -> new RuntimeException("Buyer not found"));

        Order order = new Order();
        order.setBuyer(buyer);
        order.setStatus("pending");
        order.setDeliveryAddress(request.getDeliveryAddress());
        order.setDeliveryTime(request.getDeliveryTime());

        List<OrderItem> items = new ArrayList<>();
        double total = 0;

        for (OrderItemRequest i : request.getItems()) {
            FarmerListing listing = listingRepo.findById(i.getListingId())
                    .orElseThrow(() -> new RuntimeException("Listing not found"));

            OrderItem item = new OrderItem();
            item.setOrder(order);
            item.setListing(listing);
            item.setQuantity(i.getQuantity());
            item.setPrice(listing.getPricePerUnit());

            total += i.getQuantity() * listing.getPricePerUnit();
            items.add(item);
        }

        order.setItems(items);
        order.setTotalAmount(total);

        return orderRepo.save(order);
    }

    // Buyer order history
    @GetMapping("/buyer/{buyerId}")
    public List<Order> getBuyerOrders(@PathVariable Integer buyerId) {
        return orderRepo.findByBuyer_BuyerId(buyerId);
    }
}
