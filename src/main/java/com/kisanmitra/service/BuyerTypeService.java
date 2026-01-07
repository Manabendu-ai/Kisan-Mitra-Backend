package com.kisanmitra.service;

import com.kisanmitra.models.BuyerType;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BuyerTypeService {
    BuyerType save(BuyerType type);
    List<BuyerType> getAll();
}
