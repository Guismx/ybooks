package com.project.ybooks.services;

import com.project.ybooks.models.Review;
import com.project.ybooks.repositories.ReviewRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    Review review;
    public String makeReview (Review review) {
        this.reviewRepository.save(review);
        return "Review send!";
    }

    public String updateReview (Review review, Long id) {
        review.setId(id);
        this.reviewRepository.save(review);
        return "Review update carried out successfully";
    }

    public Review deleteReview(Long id) {
        Review review = this.reviewRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Review not found"));

        this.reviewRepository.delete(review);
        return review;
    }

    public List<Review> findAll () {
        return this.reviewRepository.findAll();
    }
}
