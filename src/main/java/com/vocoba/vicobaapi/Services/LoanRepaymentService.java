package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Entity.LoanRepayment;

import java.util.List;

public interface LoanRepaymentService {
    LoanRepayment repayLoan(LoanRepayment repayment);
    List<LoanRepayment> getAllRepayments();
    LoanRepayment getRepaymentById(Long id);
    void deleteRepayment(Long id);
}
