package com.kisanmitra.service.impl;

import com.kisanmitra.models.DriverProfile;
import com.kisanmitra.service.DriverProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverProfileServiceImpl implements DriverProfileService {
    @Override
    public DriverProfile save(DriverProfile driver) {
        return null;
    }

    @Override
    public List<DriverProfile> getAll() {
        return List.of();
    }
}
