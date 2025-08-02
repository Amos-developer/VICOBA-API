package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Entity.Loan;
import com.vocoba.vicobaapi.Repository.LoanRepository;
import com.vocoba.vicobaapi.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

//    Apply for Loan
    public Loan applyLoan(Loan loan){
        return loanRepository.save(loan);
    }

// Get all loans applied
    public List<Loan> getAllLoans(){
        return loanRepository.findAll();
    }

//  Get Loan By Id
    public Loan getLoanById(Long id){
        return loanRepository.findById(id).orElseThrow(
                ()->new RuntimeException("No loan Found...")
        );
    }

//    Delete loan
    public void removeLoan(Long id){
        loanRepository.deleteById(id);
    }
}
