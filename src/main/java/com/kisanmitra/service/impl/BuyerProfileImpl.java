package com.kisanmitra.service.impl;

import com.kisanmitra.models.BuyerProfile;
import com.kisanmitra.service.BuyerProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerProfileImpl implements BuyerProfileService {
    @Override
    public BuyerProfile save(BuyerProfile buyer) {
        return null;
    }

    @Override
    public List<BuyerProfile> getAll() {
        return List.of();
    }
}
