package com.choinhet.movies.controller

import com.choinhet.movies.model.Movie
import com.choinhet.movies.service.MovieService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
@RequestMapping("/api/v1/movies")
class MovieController(private val movieService: MovieService) {
    @GetMapping
    fun getAllMovies(): ResponseEntity<List<Movie>> = ResponseEntity.ok(movieService.getAllMovies())

    @GetMapping("/{imdbId}")
    fun getSingleMovie(@PathVariable imdbId: String): ResponseEntity<Movie> =
        ResponseEntity.ok(movieService.getSingleMovie(imdbId))
}