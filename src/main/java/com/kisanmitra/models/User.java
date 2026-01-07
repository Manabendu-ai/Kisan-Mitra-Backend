package com.kisanmitra.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    @JsonProperty("user_id")
    private Integer userId;

    @Column(name = "pass")
    @JsonProperty("pass")
    private String password;

    @Column(length = 10)
    private String role;

    @Column(length = 20)
    private String name;

    @Column(length = 15)
    private String phno;

    @Column(length = 20)
    private String email;

    @Column(name = "verified_status")
    @JsonProperty("verified_status")
    private Boolean verifiedStatus;

    @Column(name = "created_at")
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
}
