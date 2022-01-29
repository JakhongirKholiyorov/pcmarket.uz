package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Computer;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Computer.class)
public interface CustomComputer {

    Integer getId();
    String getName();
    Object getBrand();
    Object getCpu();
    Object getDiagonal();
    Object getRam();
    Object getDisk();
    Object getVideoCard();


}
