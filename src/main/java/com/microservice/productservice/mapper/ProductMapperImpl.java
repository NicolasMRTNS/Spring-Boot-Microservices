package com.microservice.productservice.mapper;

import com.microservice.productservice.dto.ProductResponse;
import com.microservice.productservice.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements IMapper<Product, ProductResponse> {
    @Override
    public ProductResponse toDto(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
