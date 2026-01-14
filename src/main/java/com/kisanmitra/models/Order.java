package com.kisanmitra.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private BuyerProfile buyer;

    private String status;
    private String deliveryAddress;
    private String deliveryTime;
    private Double totalAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
}
