package com.generator.cv_server.service;

import com.generator.cv_server.domain.User;

import java.util.List;

public interface UserService {

     List<User> getUser();
     public User createUser(User user);
}
