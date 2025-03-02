package com.globetrotter.globetrotter.repository;

import com.globetrotter.globetrotter.model.Leaderboard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends MongoRepository<Leaderboard, String> {
}
