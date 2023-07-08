package com.choinhet.movies.service

import com.choinhet.movies.model.Movie
import com.choinhet.movies.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieService(private val movieRepository: MovieRepository) {
    fun getAllMovies(): List<Movie> = movieRepository.findAll()
    fun getSingleMovie(imdbId: String): Movie? = movieRepository.findMovieByImdbId(imdbId)
}