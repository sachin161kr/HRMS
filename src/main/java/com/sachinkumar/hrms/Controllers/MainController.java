package com.sachinkumar.hrms.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachinkumar.hrms.Models.Employee;
import com.sachinkumar.hrms.Models.User;
import com.sachinkumar.hrms.Repository.EmployeeRepo;
import com.sachinkumar.hrms.Repository.UserRepo;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/editEmployeeData")
    public String editEmployeeData(@RequestBody Employee employee) {
        employeeRepo.deleteByEmpEmail(employee.getEmpEmail());
        employeeRepo.save(employee);

        return "Employee Information Updated";
    }

    @PostMapping("/getEmployeeData")
    public Employee getEmployeeData(@RequestBody Employee employee) {
        return employeeRepo.findEmployeeByEmpEmail(employee.getEmpEmail());

    }

    @PostMapping("/editUserData")
    public String editUserData(@RequestBody User user) {
        userRepo.deleteByEmail(user.getEmail());
        userRepo.save(user);

        return "User Information Updated";
    }

    @PostMapping("/getUserData")
    public User getUserData(@RequestBody User user) {
        return userRepo.findUserByEmail(user.getEmail());
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

}
