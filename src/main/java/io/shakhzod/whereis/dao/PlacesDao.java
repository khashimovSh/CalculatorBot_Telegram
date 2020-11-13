package io.shakhzod.whereis.dao;

import io.shakhzod.whereis.location.LocationPlace;

import java.util.List;
import java.util.UUID;

public interface PlacesDao {

    int insertPlace(UUID id, LocationPlace locationPlace, double latitude, double longitude);
    List<LocationPlace> selectAllPlaces();


}
