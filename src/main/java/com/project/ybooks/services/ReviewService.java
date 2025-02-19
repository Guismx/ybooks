package com.project.ybooks.services;

import com.project.ybooks.models.Review;
import com.project.ybooks.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public String makeReview (Review review) {
        this.reviewRepository.save(review);
        return "Review send!";
    }

    public String updateReview (Review review, Long id) {
        review.setId(id);
        this.reviewRepository.save(review);
        return "Review update carried out successfully";
    }
}
