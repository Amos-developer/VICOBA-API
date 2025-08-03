package com.vocoba.vicobaapi.Controllers;

import com.vocoba.vicobaapi.Entity.LoanRepayment;
import com.vocoba.vicobaapi.Services.LoanRepaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/repayments")
@CrossOrigin(origins = "*")
public class LoanRepaymentController {

    @Autowired
    private LoanRepaymentService loanRepaymentService;

    @PostMapping("/create")
    public LoanRepayment createRepayment(@RequestBody LoanRepayment repayment) {
        return loanRepaymentService.repayLoan(repayment);
    }

    @GetMapping("/read")
    public List<LoanRepayment> getAllRepayments() {
        return loanRepaymentService.getAllRepayments();
    }

    @GetMapping("/read/{id}")
    public LoanRepayment getRepaymentById(@PathVariable Long id) {
        return loanRepaymentService.getRepaymentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRepayment(@PathVariable Long id) {
        loanRepaymentService.deleteRepayment(id);
    }
}
