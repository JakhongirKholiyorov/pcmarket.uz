package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Cpu;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Cpu.class)
public interface CustomCpu {
    Integer getId();
    String getName();

}
