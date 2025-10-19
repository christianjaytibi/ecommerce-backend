package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.ProductRequestDto;
import com.example.ecommerce.dto.ProductResponseDto;
import com.example.ecommerce.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

     ProductResponseDto toDto (Product product);
     Product toEntity(ProductRequestDto productDto);
     void updateProduct(@MappingTarget Product product, ProductRequestDto productDto);
}
