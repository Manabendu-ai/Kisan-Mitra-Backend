package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "farmer_listings")
@Getter
@Setter
public class FarmerListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cropName;
    private BigDecimal quantity;
    private String unit;
    private String quality;

    @Column(name = "price_per_unit", precision = 10, scale = 2)
    private BigDecimal pricePerUnit;
    private String imageUrl;
    private String status = "active";

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private FarmerProfile farmer;
}
