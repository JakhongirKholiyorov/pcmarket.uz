package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Computer;
import com.example.pcmarketspringdatarest.projection.CustomComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "computer",excerptProjection = CustomComputer.class)
public interface ComputerRepository extends JpaRepository<Computer, Integer> {
}
