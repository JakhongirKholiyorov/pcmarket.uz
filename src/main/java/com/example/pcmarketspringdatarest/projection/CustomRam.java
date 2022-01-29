package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Ram;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Ram.class)
public interface CustomRam {
    Integer getId();
    Double getSize();
}
