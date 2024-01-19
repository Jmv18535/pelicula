package com.jmvizertis;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class PeliculaService {

    private WebClient webclient = WebClient.create("https://api.themoviedb.org/3/search/movie");

    public Mono<String> getPeliculasPorNombre(String nombre) {
        System.out.println(nombre);

        return webclient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("api_key", "9c9f0ec8489b97a15633a9ee4e364466")
                        .queryParam("query", nombre)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }

}
