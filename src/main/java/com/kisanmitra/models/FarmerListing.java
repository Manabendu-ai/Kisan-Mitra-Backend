package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "farmer_listings")
@Getter
@Setter
public class FarmerListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cropName;
    private Double quantity;
    private String unit;
    private String quality;
    private Double pricePerUnit;
    private String imageUrl;
    private String status = "active";

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private FarmerProfile farmer;
}
