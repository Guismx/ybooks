package com.project.ybooks.repositories;

import com.project.ybooks.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
