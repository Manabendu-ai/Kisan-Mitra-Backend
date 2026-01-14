package com.kisanmitra.dto;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Data
@Getter
@Service
public class CallRequestDTO {
    private Integer farmerId;
    private String phone;
}
