package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    public void deleteByEmail(String email);

    public User findUserByEmail(String email);

}
