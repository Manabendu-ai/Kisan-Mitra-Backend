package com.kisanmitra.Controllers;

import com.kisanmitra.models.FarmerProfile;
import com.kisanmitra.service.FarmerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/KisanMitra/farmers")
public class FarmerProfileController {

    @Qualifier("farmerProfileServiceImpl")
    @Autowired
    private FarmerProfileService service;

    @PostMapping
    public FarmerProfile create(@RequestBody FarmerProfile farmer) {
        return service.save(farmer);
    }

    @GetMapping
    public List<FarmerProfile> getAll() {
        return service.getAll();
    }
}
