package com.example.categoryservice.service.impl;

import com.example.categoryservice.entity.Category;

import java.util.Optional;

public interface CategoryImpl {
    Optional<Category> findById(Long id);
    Category saveCategory(Category category);
}
