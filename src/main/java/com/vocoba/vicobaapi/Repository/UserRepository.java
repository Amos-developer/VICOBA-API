package com.vocoba.vicobaapi.Repository;

import com.vocoba.vicobaapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhoneNo(String phone);
}
