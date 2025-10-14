package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.ProductResponseDto;
import com.example.ecommerce.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

     ProductResponseDto toDto (Product product);
}
