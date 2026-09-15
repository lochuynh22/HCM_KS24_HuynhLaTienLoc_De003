package com.example.categoryservice.service;

import com.example.categoryservice.Repo.CategoryRepo;
import com.example.categoryservice.entity.Category;
import com.example.categoryservice.service.impl.CategoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements CategoryImpl {

    private final CategoryRepo repo;

    public CategoryService(CategoryRepo repo) {
        this.repo = repo;
    }


    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Category saveCategory(Category category) {
        return null;
    }

}
