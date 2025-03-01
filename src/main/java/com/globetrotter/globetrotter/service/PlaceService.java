package com.globetrotter.globetrotter.service;

import com.globetrotter.globetrotter.model.Place;
import com.globetrotter.globetrotter.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    public Place addPlace(Place place) {
        return placeRepository.save(place);
    }
}
