package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Entity.Loan;

import java.util.List;

public interface LoanService {
    Loan applyLoan(Loan loan);
    List<Loan> getAllLoans();
    Loan getLoanById(Long id);
    void removeLoan(Long id);
}
