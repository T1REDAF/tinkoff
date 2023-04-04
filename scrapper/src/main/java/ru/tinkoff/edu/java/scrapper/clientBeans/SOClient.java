package ru.tinkoff.edu.java.scrapper.clientBeans;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import ru.tinkoff.edu.java.scrapper.dto.SOResponse;


public class SOClient {
    private static final String STACK_OVERFLOW_BASE_URL = "https://api.stackexchange.com";
    private WebClient webClient;
    private String URL;

    public SOClient(String customURL){
        URL = customURL;
        webClient = WebClient.builder()
                .baseUrl(URL)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public SOClient(){
        URL = STACK_OVERFLOW_BASE_URL;
        webClient = WebClient.builder()
                .baseUrl(URL)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    SOResponse fetchQuestion(long id){
        return webClient
                .get()
                .uri("/questions/{id}", id)
                .retrieve()
                .bodyToMono(SOResponse.class)
                .block();
    }
}