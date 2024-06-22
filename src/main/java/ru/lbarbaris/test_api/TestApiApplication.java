package ru.lbarbaris.test_api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lbarbaris.test_api.communication.Communication;
import ru.lbarbaris.test_api.config.testConfig;
import ru.lbarbaris.test_api.entity.WeatherResponse;

import java.util.Scanner;

@SpringBootApplication
public class TestApiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(testConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter api Key");
        String apiKey = scanner.next();

        communication.setUrl(city, apiKey);

        WeatherResponse weatherResponse = communication.getWeather();
        System.out.println(weatherResponse);
        /*SpringApplication.run(TestApiApplication.class, args);*/
    }

}
