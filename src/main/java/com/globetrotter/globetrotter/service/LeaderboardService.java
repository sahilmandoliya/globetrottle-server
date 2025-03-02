package com.globetrotter.globetrotter.service;

import com.globetrotter.globetrotter.model.Leaderboard;
import com.globetrotter.globetrotter.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    private LeaderboardRepository leaderboardRepository;

    public List<Leaderboard> getAllEntries() {
        return leaderboardRepository.findAll();
    }

    public Leaderboard addEntry(Leaderboard entry) {
        return leaderboardRepository.save(entry);
    }
}
