package com.kisanmitra.service;

import com.kisanmitra.models.CropsGrown;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CropsGrownService {
    CropsGrown save(CropsGrown crop);
    List<CropsGrown> getAll();
}
