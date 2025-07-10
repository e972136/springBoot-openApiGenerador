package com.gaspar.demo.controller;

import com.gaspar.demo.entity.User;
import com.gaspar.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> addUser(
            @RequestBody User user
    ){
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("user added "+ user.name());
    }

}
