package com.social.SocialNetwork.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.SocialNetwork.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        User Maria = new User("1", "Maria", "Maria@gmail.com");
        User Alex = new User("2", "Alex", "Alex@gmail.com");
        list.addAll(Arrays.asList(Maria, Alex));
        return ResponseEntity.ok().body(list);
    }

}
