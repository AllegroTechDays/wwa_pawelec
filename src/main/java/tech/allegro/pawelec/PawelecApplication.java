package tech.allegro.pawelec;

import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PawelecApplication {

    public static void main(String[] args) {
        SpringApplication.run(PawelecApplication.class, args);

    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
