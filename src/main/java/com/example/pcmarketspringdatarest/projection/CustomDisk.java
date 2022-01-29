package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.Disk;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Disk.class)
public interface CustomDisk {
    Integer getId();
    String getName();
    Double getSize();

}
