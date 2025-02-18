package com.project.ybooks.controllers;

import com.project.ybooks.models.Review;
import com.project.ybooks.repositories.ReviewRepository;
import com.project.ybooks.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ybook/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/save")
    public String makeReview (@RequestBody Review review) {
        try {
            return this.reviewService.makeReview(review);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
