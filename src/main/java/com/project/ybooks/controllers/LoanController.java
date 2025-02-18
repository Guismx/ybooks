package com.project.ybooks.controllers;


import com.project.ybooks.models.Loan;
import com.project.ybooks.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    LoanService loanService;

    @PostMapping("/save")
    public ResponseEntity<String> makeLoan (@RequestBody Loan loan) {
        try {
            String returnLoan = loanService.makeLoan(loan);
            return new ResponseEntity<>(returnLoan, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error creting loan", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateLoan (@RequestBody Loan loan,@PathVariable Long id) {
        try {
            String returnUpdate = loanService.updateLoan(loan, id);
            return new ResponseEntity<>(returnUpdate, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error updating loan", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteLoan (@PathVariable Long id) {
        try {
            String returnDelete = loanService.deleteLoan(id);
            return new ResponseEntity<>(returnDelete, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error delete loan", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Loan>> listLoan () {
        try {
            List<Loan> list = loanService.listLoan();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Loan> searchLoan (@PathVariable Long id) {
        try {
            this.loanService.searchLoan(id);
            return new ResponseEntity<>(this.loanService.searchLoan(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
