package com.jmvizertis;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PeliculaController {

    PeliculaService service = new PeliculaService();

    @GetMapping("/api/pelicula")
    public Mono<String> getMethodName(@RequestParam String nombre) {
        return service.getPeliculasPorNombre(nombre);
    }

}
