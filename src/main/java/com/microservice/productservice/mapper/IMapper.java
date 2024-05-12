package com.microservice.productservice.mapper;

import com.microservice.productservice.dto.IAppDto;
import com.microservice.productservice.dto.ProductResponse;
import com.microservice.productservice.model.IAppEntity;
import com.microservice.productservice.model.Product;

public interface IMapper<E extends IAppEntity, D extends IAppDto> {
    D toDto(E product);
}
