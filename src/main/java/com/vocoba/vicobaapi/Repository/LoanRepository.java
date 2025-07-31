package com.vocoba.vicobaapi.Repository;

import com.vocoba.vicobaapi.Entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
