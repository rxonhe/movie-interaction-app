package com.choinhet.movies.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

@Document(collection = "movies")
data class Movie(
    @Id
    val id: ObjectId,
    val imdbId: String,
    val title: String,
    val releaseDate: String,
    val trailerLink: String,
    val poster: String,
    val genres: List<String>,
    val backdrops: List<String>,
    @DocumentReference
    val reviewIds: List<Review>
)