package com.example.categoryservice.Repo;

import com.example.categoryservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Long, Category> {
}
