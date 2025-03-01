package com.globetrotter.globetrotter.repository;

import com.globetrotter.globetrotter.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {
}

