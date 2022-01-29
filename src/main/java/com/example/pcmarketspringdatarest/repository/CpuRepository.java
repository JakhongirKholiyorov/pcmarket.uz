package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Cpu;
import com.example.pcmarketspringdatarest.projection.CustomCpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cpu",excerptProjection = CustomCpu.class)
public interface CpuRepository extends JpaRepository<Cpu, Integer> {
}
