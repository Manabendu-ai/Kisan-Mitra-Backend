package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Entity
@Table(name = "call_requests")
@Getter
@Setter
public class CallRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "farmer_id")
    private Integer farmerId;
    private String phone;
    private String status;
    private LocalDateTime createdAt;

}
