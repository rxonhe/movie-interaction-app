package com.choinhet.movies.repository

import com.choinhet.movies.model.Movie
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : MongoRepository<Movie, ObjectId> {
    fun findMovieByImdbId(imdbId: String): Movie?
}