package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
}
