package com.project.ybooks.repositories;

import com.project.ybooks.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository <Loan, Long> {
}