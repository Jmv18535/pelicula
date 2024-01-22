# Pelicula
> [!Note]
> Pequeña aplicación Spring Boot Izertis

## Introducción

Este proyecto consiste en la construcción de una pequeña aplicación utilizando Spring Framework para exponer un API de películas. La aplicación permitirá consultar películas por nombre mediante llamadas HTTP/GET y utilizará un servicio externo, The Movie Database (TMDB), para obtener la información necesaria.


## EndPoint
Ejecutar el jar peliculas-0.0.1-SNAPSHOT.jar con java 17.

Get: http://localhost:8080/api/pelicula?nombre={nombre}

Basic Authentication.
Username = user
Password = pass

Consulta películas por su nombre. El parámetro {nombre} debe ser reemplazado con el nombre de la película que se desea buscar.

## Configuración Adicional

Para la creación de esta aplicación se ha hecho uso de Spring Web MVC, Spring Web Client, Spring Boot Starter Security y Spring Boot Starter Cache.

### CORS 
Se ha configurado CORS para permitir llamadas desde aplicaciones web, haciendo uso de la anotación @CrossOrigin.

### Caché
Se ha incorporado un sistema de caché para mejorar el rendimiento de las consultas, haciendo uso de @EnableCaching y @Cacheable("PeliculasCache").

### Autenticación
La aplicación ha implementado un mecanismo de autenticación para proteger el API expuesto desde Spring. Se ha hecho uso de Basic Authentication con Spring Boot Starter Security añadiendo en el fichero properties lo siguiente:

spring.security.user.name=user

spring.security.user.password=pass