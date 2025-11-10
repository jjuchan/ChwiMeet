package com.back.domain.category.category.dto;

import com.back.domain.category.category.common.ChildCategory;

import java.util.List;

public record CategoryResBody(
        Long id,
        String name,
        List<ChildCategory> child
) {
}
