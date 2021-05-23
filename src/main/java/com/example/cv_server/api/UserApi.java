package com.example.cv_server.api;

import com.example.cv_server.domain.User;
import com.example.cv_server.repository.UserRepository;
import com.example.cv_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UserApi {

    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public List<User> getUser(){

      List<User> users = userService.getUser();
        return userService.getUser();
    }

    @PostMapping("/user")
    public  User createUser(@RequestBody User user){
        return  userService.createUser(user);
    }
}
