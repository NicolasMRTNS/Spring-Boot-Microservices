package com.microservice.productservice.utils;

import com.microservice.productservice.dto.ProductRequest;

import java.math.BigDecimal;

public class ObjectCreationTestUtils {
    public static ProductRequest getProductRequest() {
        return ProductRequest.builder()
                .name("iPhone 15")
                .description("iPhone 15")
                .price(BigDecimal.valueOf(1200))
                .build();
    }
}
