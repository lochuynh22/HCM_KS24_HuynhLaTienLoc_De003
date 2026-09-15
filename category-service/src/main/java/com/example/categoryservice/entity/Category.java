package com.example.categoryservice.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Builder
public class Category {
    private Long id;
    private String name;
    private String categoryId;
}
