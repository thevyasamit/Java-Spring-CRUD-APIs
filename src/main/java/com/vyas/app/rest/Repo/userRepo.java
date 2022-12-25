package com.vyas.app.rest.Repo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vyas.app.rest.Models.users;

public interface userRepo extends JpaRepository<users,Long> {
    
}
