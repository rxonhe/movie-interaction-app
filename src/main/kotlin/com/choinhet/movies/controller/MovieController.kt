package com.choinhet.movies.controller

import com.choinhet.movies.model.Movie
import com.choinhet.movies.service.MovieService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/movies")
class MovieController(private val movieService: MovieService) {
    @GetMapping
    fun getAllMovies(): ResponseEntity<List<Movie>> = ResponseEntity.ok(movieService.getAllMovies())

    @GetMapping("/{imdbId}")
    fun getSingleMovie(@PathVariable imdbId: String): ResponseEntity<Movie> =
        ResponseEntity.ok(movieService.getSingleMovie(imdbId))
}