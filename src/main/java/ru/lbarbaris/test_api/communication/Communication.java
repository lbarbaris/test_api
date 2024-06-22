package ru.lbarbaris.test_api.communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.lbarbaris.test_api.entity.WeatherResponse;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;


    private String url;

    public void setUrl(String city, String apiKey){
        url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apiKey);
    }

    public WeatherResponse getWeather(){
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
