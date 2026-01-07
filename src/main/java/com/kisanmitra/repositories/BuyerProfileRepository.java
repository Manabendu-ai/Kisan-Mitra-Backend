package com.kisanmitra.repositories;

import com.kisanmitra.models.BuyerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BuyerProfileRepository
        extends JpaRepository<BuyerProfile, Integer> {
}
