package com.example.pcmarketspringdatarest.projection;

import com.example.pcmarketspringdatarest.entity.VideoCard;
import org.springframework.context.annotation.Primary;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = VideoCard.class)
public interface CustomVideoCard {

    Integer getId();
    String getName();
    Double getSize();
}
