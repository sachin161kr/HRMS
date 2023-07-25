package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachinkumar.hrms.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    public void deleteByEmail(String email);

    public User findUserByEmail(String email);

}
