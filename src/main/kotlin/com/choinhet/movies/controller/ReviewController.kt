package com.choinhet.movies.controller

import com.choinhet.movies.model.Review
import com.choinhet.movies.service.ReviewService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
@RequestMapping("/api/v1/reviews")
class ReviewController(private val reviewService: ReviewService) {
    @PostMapping
    fun createReview(@RequestBody payload: Map<String, String>): ResponseEntity<Review> =
        payload["reviewBody"]?.let { body ->
            payload["imdbId"]?.let { imdbId ->
                ResponseEntity.status(HttpStatus.CREATED).body(reviewService.createReview(body, imdbId))
            }
        } ?: ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
}