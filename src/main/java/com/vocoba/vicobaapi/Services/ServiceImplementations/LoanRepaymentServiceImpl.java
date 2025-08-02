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
        return loanRepaymentRRepository.save(repayment);
    }

    @Override
    public List<LoanRepayment> getAllRepayments() {
        return loanRepaymentRRepository.findAll();
    }

    @Override
    public LoanRepayment getRepaymentById(Long id) {

        return loanRepaymentRRepository.findById(id).orElseThrow(
                ()->new RuntimeException("No Loan Repayment found...")
        );
    }

    @Override
    public void deleteRepayment(Long id) {
        loanRepaymentRRepository.deleteById(id);
    }
}
