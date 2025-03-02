package com.globetrotter.globetrotter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "leaderboard")
public class Leaderboard {
    @Id
    private String id;
    private String username;
    private int score;
}
