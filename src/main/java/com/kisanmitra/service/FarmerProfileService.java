package com.kisanmitra.service;

import com.kisanmitra.models.FarmerProfile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface FarmerProfileService {
    FarmerProfile save(FarmerProfile farmer);
    List<FarmerProfile> getAll();

    Optional<Object> findByUser_UserId(Integer userId);
}
