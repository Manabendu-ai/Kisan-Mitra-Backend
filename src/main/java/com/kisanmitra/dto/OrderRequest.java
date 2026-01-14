package com.kisanmitra.dto;

import lombok.*;
import java.util.List;

@Data
@Getter @Setter
public class OrderRequest {
    private Integer buyerId;
    private String deliveryAddress;
    private String deliveryTime;
    private List<OrderItemRequest> items;
}
