package ru.lbarbaris.test_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("ru.lbarbaris.test_api")
public class testConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
