package com.project.ybooks.repositories;

import com.project.ybooks.models.UserAction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserActionRespository extends JpaRepository <UserAction, Long> {
}
