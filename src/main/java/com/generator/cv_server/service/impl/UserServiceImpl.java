package com.generator.cv_server.service.impl;

import com.generator.cv_server.domain.User;
import com.generator.cv_server.service.UserService;
import com.generator.cv_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUser() {
        List<User> user = userRepository.findAll();
        return user;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
