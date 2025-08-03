package com.vocoba.vicobaapi.Controllers;

import com.vocoba.vicobaapi.Entity.Loan;
import com.vocoba.vicobaapi.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
@CrossOrigin(origins = "*")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/create")
    public Loan createLoan(@RequestBody Loan loan) {
        return loanService.applyLoan(loan);
    }

    @GetMapping("/read")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/read/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.removeLoan(id);
    }
}
