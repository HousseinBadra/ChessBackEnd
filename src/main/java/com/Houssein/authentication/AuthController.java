package com.Houssein.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    String welcome() {
        return "Welcome";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return service.verify(user);
    }
}
