package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Disk;
import com.example.pcmarketspringdatarest.projection.CustomDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "disk",excerptProjection = CustomDisk.class)
public interface DiskRepository extends JpaRepository<Disk, Integer> {
}
