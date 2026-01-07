package com.kisanmitra.Controllers;

import com.kisanmitra.models.BuyerProfile;
import com.kisanmitra.service.BuyerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buyers")
public class BuyerProfileController {

    @Qualifier("buyerProfileImpl")
    private BuyerProfileService service;

    @PostMapping
    public BuyerProfile create(@RequestBody BuyerProfile buyer) {
        return service.save(buyer);
    }

    @GetMapping
    public List<BuyerProfile> getAll() {
        return service.getAll();
    }
}

