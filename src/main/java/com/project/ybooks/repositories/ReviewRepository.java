package com.project.ybooks.repositories;

import com.project.ybooks.services.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository <Review, Long> {
}
