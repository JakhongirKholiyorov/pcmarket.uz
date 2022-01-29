package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Disk;
import com.example.pcmarketspringdatarest.entity.Ram;
import com.example.pcmarketspringdatarest.projection.CustomRam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ram",excerptProjection = CustomRam.class)
public interface RamRepository extends JpaRepository<Ram, Integer> {
}
