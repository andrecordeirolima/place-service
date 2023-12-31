package com.andrecordeiro.placeservice.web;

import com.andrecordeiro.placeservice.api.PlaceResponse;
import com.andrecordeiro.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),
            place.state(), place.createdAt(), place.updatedAt());
    }
}
