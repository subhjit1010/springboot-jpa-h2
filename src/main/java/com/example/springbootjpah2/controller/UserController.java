package com.example.springbootjpah2.controller;


import com.example.springbootjpah2.model.User;
import com.example.springbootjpah2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-data-jpa")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<User> getAllUser(){
        return  service.getUsers();
    }

    @PostMapping
    public User adduser(@RequestBody User user){
        return  service.saveUser(user);
    }
}
