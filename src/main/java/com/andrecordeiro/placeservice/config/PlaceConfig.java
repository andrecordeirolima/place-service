package com.andrecordeiro.placeservice.config;

import com.andrecordeiro.placeservice.domain.PlaceRepository;
import com.andrecordeiro.placeservice.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);

    }
}
