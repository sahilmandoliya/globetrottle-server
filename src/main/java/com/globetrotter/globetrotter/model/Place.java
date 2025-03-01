package com.globetrotter.globetrotter.model;

import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "places")
public class Place {
    @Id
    private String id;
    private String city;
    private String country;
    private List<String> clues;
    private List<String> fun_fact;
    private List<String> trivia;
}

