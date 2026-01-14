package com.kisanmitra.repositories;

import com.kisanmitra.models.FarmerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmerProfileRepository
        extends JpaRepository<FarmerProfile, Integer> {
    Optional<FarmerProfile> findByUser_UserId(Integer userId);

}

