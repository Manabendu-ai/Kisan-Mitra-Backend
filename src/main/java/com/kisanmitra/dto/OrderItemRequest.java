package com.kisanmitra.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderItemRequest {
    private Long listingId;
    private Double quantity;
}

