package com.example.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;

@RestController
public class LoginController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Query query = new Query(Criteria.where("username").is(username).and("password").is(password));
        long count = mongoTemplate.count(query, "users");

        if (count > 0) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }
}
