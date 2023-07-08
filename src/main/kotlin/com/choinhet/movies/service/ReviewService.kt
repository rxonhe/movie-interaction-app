package com.choinhet.movies.service

import com.choinhet.movies.model.Movie
import com.choinhet.movies.model.Review
import com.choinhet.movies.repository.ReviewRepository
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Update
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ReviewService(private val reviewRepository: ReviewRepository, private val mongoTemplate: MongoTemplate) {

    fun createReview(reviewBody: String, imdbId: String): Review {
        val review = Review(reviewBody, LocalDateTime.now(), LocalDateTime.now())
        reviewRepository.insert(review)
        mongoTemplate.update(Movie::class.java)
            .matching(Criteria.where("imdbId").`is`(imdbId))
            .apply(Update().push("reviewIds").value(review))
            .first()
        return review
    }

}