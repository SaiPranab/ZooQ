package com.ZooQ.backend.service;

import com.ZooQ.backend.dto.ProductResponse;
import org.springframework.web.multipart.MultipartFile;

import com.ZooQ.backend.dto.ProductDTO;
import java.io.IOException;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductResponse searchProductByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

//    ProductDTO updateProduct(Long productId, ProductDTO product);
//
//    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
