package com.jmvizertis;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PeliculaController {

    PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @GetMapping("/api/pelicula")
    @CrossOrigin
    @Cacheable("PeliculasCache")
    public String getPeliculas(@RequestParam String nombre) {
        return service.getPeliculasPorNombre(nombre);
    }

}
