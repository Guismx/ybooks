package com.project.ybooks.controllers;

import com.project.ybooks.models.Review;
import com.project.ybooks.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ybook/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/save")
    public ResponseEntity<String> makeReview (@RequestBody Review review) {
        try {
            String returnMessage = this.reviewService.makeReview(review);
            return new ResponseEntity<>(returnMessage, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateReview (@RequestBody Review review, @PathVariable Long id) {
        try {
            String returnMessage = this.reviewService.updateReview(review, id);
            return new ResponseEntity<>(returnMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
