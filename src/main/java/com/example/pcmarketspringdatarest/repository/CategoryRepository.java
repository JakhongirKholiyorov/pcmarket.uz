package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Category;
import com.example.pcmarketspringdatarest.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
