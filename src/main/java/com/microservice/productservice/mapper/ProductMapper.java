package com.microservice.productservice.mapper;

import com.microservice.productservice.dto.ProductResponse;
import com.microservice.productservice.model.Product;

public interface ProductMapper {
    ProductResponse toProductResponse(Product product);
}
