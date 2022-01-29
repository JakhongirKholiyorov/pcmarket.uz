package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Brand;
import com.example.pcmarketspringdatarest.projection.CustomBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "brand",excerptProjection = CustomBrand.class)
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
