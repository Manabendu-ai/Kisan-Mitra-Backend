package com.kisanmitra.Controllers;

import com.kisanmitra.models.FarmerListing;
import com.kisanmitra.repositories.FarmerListingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/listings")
@CrossOrigin
public class FarmerListingController {

    private final FarmerListingRepository repo;

    public FarmerListingController(FarmerListingRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public FarmerListing create(@RequestBody FarmerListing listing) {
        listing.setStatus("active");
        return repo.save(listing);
    }

    @GetMapping
    public List<FarmerListing> getAllActive() {
        return repo.findByStatus("active");
    }

    @GetMapping("/{id}")
    public FarmerListing getOne(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
}
