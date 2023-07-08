package com.choinhet.movies.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "reviews")
data class Review(
    @Id
    val id: ObjectId,
    val body: String,
    val created: LocalDateTime,
    val updated: LocalDateTime
) {
    constructor(body: String, created: LocalDateTime, updated: LocalDateTime) : this(
        ObjectId.get(),
        body,
        created,
        updated
    )
}