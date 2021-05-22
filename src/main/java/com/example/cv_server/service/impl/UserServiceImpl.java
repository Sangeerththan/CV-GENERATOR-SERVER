package com.example.cv_server.service.impl;

import com.example.cv_server.domain.User;
import com.example.cv_server.service.UserService;
import com.example.cv_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUser() {
        List<User> user = userRepository.findAll();
        return user;
    }
}
