package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Diagonal;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Diagonal.class)
public interface CustomDiagonal {
    Integer getId();
    Double getSize();

}
