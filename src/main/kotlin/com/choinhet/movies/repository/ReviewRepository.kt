package com.choinhet.movies.repository

import com.choinhet.movies.model.Review
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository: MongoRepository<Review, ObjectId> {
}