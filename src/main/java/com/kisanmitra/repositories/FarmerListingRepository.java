package com.kisanmitra.repositories;

import com.kisanmitra.models.FarmerListing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmerListingRepository
        extends JpaRepository<FarmerListing, Long> {

    List<FarmerListing> findByFarmer_FarmerId(Integer farmerId);

    List<FarmerListing> findByStatus(String active);
}
