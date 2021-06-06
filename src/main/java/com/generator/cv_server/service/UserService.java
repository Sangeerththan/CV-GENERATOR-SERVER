package com.generator.cv_server.service;

import com.generator.cv_server.domain.User;

import java.util.Optional;

public interface UserService {

     Optional<User> getUser(Long id);
     public User createUser(User user);
}
