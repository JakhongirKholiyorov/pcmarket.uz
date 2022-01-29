package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Brand;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Brand.class)
public interface CustomBrand {

    Integer getId();
    String getName();

}
