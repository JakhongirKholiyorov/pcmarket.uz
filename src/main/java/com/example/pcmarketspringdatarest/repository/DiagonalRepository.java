package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Diagonal;
import com.example.pcmarketspringdatarest.projection.CustomDiagonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "diagonal",excerptProjection = CustomDiagonal.class)
public interface DiagonalRepository extends JpaRepository<Diagonal, Integer> {
}
