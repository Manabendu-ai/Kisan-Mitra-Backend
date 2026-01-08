package com.kisanmitra.service;

import com.kisanmitra.models.DriverProfile;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverProfileService {
    DriverProfile save(DriverProfile driver);
    List<DriverProfile> getAll();
}
