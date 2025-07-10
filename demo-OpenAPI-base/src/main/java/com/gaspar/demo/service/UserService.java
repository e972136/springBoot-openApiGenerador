package com.gaspar.demo.service;

import com.gaspar.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
