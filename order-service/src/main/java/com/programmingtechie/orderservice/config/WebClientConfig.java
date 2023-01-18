package com.programmingtechie.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    //bean para generar un webClient
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

}
