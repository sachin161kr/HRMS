package com.sachinkumar.hrms.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachinkumar.hrms.Models.Employee;
import com.sachinkumar.hrms.Models.User;
import com.sachinkumar.hrms.Repository.EmployeeRepo;
import com.sachinkumar.hrms.Repository.UserRepo;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/registerUser")
    public String register(@RequestBody User user) {
        List<User> allUsers = userRepo.findAll();

        for (User u : allUsers) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                return "User Already Registered";
            }
        }

        userRepo.save(user);
        return "User Registered";
    }

    @PostMapping("/registerEmployee")
    public String registerEmployee(Employee employee) {
        List<Employee> allEmployees = employeeRepo.findAll();

        for (Employee u : allEmployees) {
            if (u.getEmpAddress().equals(employee.getEmpEmail())) {
                return "Employee Already Registered";
            }
        }

        employeeRepo.save(employee);
        return "Employee Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        List<User> allUsers = userRepo.findAll();

        for (User u : allUsers) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                return "Login Successful";
            }
        }

        return "Login Failed";
    }

}
