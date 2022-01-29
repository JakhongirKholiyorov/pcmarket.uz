package com.example.pcmarketspringdatarest.repository;

import com.example.pcmarketspringdatarest.entity.Disk;
import com.example.pcmarketspringdatarest.entity.VideoCard;
import com.example.pcmarketspringdatarest.projection.CustomVideoCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "videoCard",excerptProjection = CustomVideoCard.class)
public interface VideoCardRepository extends JpaRepository<VideoCard, Integer> {
}
