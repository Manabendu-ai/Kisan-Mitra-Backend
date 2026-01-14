package com.kisanmitra.service.impl;

import com.kisanmitra.models.FarmerListing;
import com.kisanmitra.models.FarmerProfile;
import com.kisanmitra.repositories.FarmerListingRepository;
import com.kisanmitra.repositories.FarmerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerListingService {

    @Autowired
    private FarmerListingRepository repo;

    @Autowired
    private FarmerProfileRepository farmerRepo;

    public FarmerListing create(Integer farmerId, FarmerListing listing) {
        FarmerProfile farmer = farmerRepo.findById(farmerId)
                .orElseThrow(() -> new RuntimeException("Farmer not found"));

        listing.setFarmer(farmer);
        listing.setStatus("active");

        return repo.save(listing);
    }

    public List<FarmerListing> getMyListings(Integer farmerId) {
        return repo.findByFarmer_FarmerId(farmerId);
    }
}
