package com.generator.cv_server.api;

import com.generator.cv_server.domain.User;
import com.generator.cv_server.service.UserService;
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
