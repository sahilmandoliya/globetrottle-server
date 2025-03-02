package com.globetrotter.globetrotter.controller;

import com.globetrotter.globetrotter.model.Leaderboard;
import com.globetrotter.globetrotter.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping
    public List<Leaderboard> getAllLeaderboardEntries() {
        return leaderboardService.getAllEntries();
    }

    @PostMapping
    public Leaderboard addLeaderboardEntry(@RequestBody Leaderboard entry) {
        return leaderboardService.addEntry(entry);
    }
}
