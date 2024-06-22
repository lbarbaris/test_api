package ru.lbarbaris.test_api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Setter
@ToString
public class WeatherResponse {

    private Main main;


    private Weather[] weather;

    @JsonProperty("name")
    private String name;


    @ToString
    @Setter
    private static class Main {
        private double temp;
        private int pressure;
        private int humidity;

    }


    @ToString
    @Setter
    private static class Weather{
        private String description;
        private String icon;
    }


}
