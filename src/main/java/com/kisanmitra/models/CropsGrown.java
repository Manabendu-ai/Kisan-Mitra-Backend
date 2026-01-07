package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "crops_grown")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CropsGrown {
    @Id
    @Column(name = "farmer_id")
    private Integer farmerId;
    private String crop;
}
