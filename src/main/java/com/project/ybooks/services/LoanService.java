package com.project.ybooks.services;


import com.project.ybooks.models.Loan;
import com.project.ybooks.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public String makeLoan (Loan loan) {
        this.loanRepository.save(loan);
        return "Loan created with successfully";
    }

    public String updateLoan (Loan loan, Long id) {
        loan.setId(id);
        this.loanRepository.save(loan);
        return "Loan updated with successfully";
    }

    public String deleteLoan (Long id) {
        this.loanRepository.deleteById(id);
        return "Loan deleted with successfully";
    }

    public List<Loan> listLoan () {
        return this.loanRepository.findAll();
    }

    public Loan searchLoan (Long id) {
        return this.loanRepository.findById(id).orElse(null);
    }
}