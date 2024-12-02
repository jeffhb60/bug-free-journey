package com.jeffhb60.bugfreejourney.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ProductDTO {
    private Long productId;
    private String productName;
    private String image;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;
}
