package com.jeffhb60.bugfreejourney.dto;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
public class OrderItemDTO {

    private Long orderItemId;
    private ProductDTO product;
    private Integer quantity;
    private double discount;
    private double orderedProductPrice;
}