package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Entity.LoanRepayment;
import com.vocoba.vicobaapi.Repository.LoanRepaymentRRepository;
import com.vocoba.vicobaapi.Repository.LoanRepository;
import com.vocoba.vicobaapi.Services.LoanRepaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService {

    @Autowired
    private LoanRepaymentRRepository loanRepaymentRRepository;


    @Override
    public LoanRepayment repayLoan(LoanRepayment repayment) {
        return null;
    }

    @Override
    public List<LoanRepayment> getAllRepayments() {
        return null;
    }

    @Override
    public LoanRepayment getRepaymentById(Long id) {
        return null;
    }

    @Override
    public void deleteRepayment(Long id) {

    }
}
