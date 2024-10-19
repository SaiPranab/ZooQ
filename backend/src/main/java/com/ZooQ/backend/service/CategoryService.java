package com.ZooQ.backend.service;

import com.ZooQ.backend.dto.CategoryDTO;
import com.ZooQ.backend.dto.CategoryResponse;

public interface CategoryService {
     CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
     CategoryDTO createCategory(CategoryDTO categoryDTO);

     CategoryDTO deleteCategory(Long categoryId);

     CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
