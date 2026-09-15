package com.example.categoryservice.dto;

import java.math.BigDecimal;

public record CategoryResponse(
        Long id,
        String name,
        BigDecimal price
) {}
