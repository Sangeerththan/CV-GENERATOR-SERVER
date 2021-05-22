package com.example.cv_server.api;

import com.example.cv_server.domain.User;
import com.example.cv_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="api/v1")
public class UserApi {


//    private UserService userService;
    @Autowired
    private UserRepository userRepository;



    @GetMapping("/user")
    public List<User> getUser(){

//        List<User> users = userService.getUser();
        return userRepository.findAll();
    }
}
