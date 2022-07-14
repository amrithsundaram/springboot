package com.amrith.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amrith.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
