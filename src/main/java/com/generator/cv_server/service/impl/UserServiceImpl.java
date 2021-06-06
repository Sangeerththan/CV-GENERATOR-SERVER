package com.generator.cv_server.service.impl;

import com.generator.cv_server.domain.User;
import com.generator.cv_server.service.UserService;
import com.generator.cv_server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
