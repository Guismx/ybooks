package com.project.ybooks.controllers;

import com.project.ybooks.models.Review;
import com.project.ybooks.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Review> deleteReview (@PathVariable Long id) {
        try {
            Review deletedReview =this.reviewService.deleteReview(id);
            return new ResponseEntity<>(deletedReview, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Review>> findAll() {
        try {
            List<Review> list = this.reviewService.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}