package com.filmrate.filmrate;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<Integer,User> users = new HashMap<>();
    private int generatedId =1;

    @PostMapping
    public User createUser(@RequestBody User user){   //user приходит из body
        user.setId(generatedId++);
        users.put(user.getId(),user);
        return user;

    }
    @GetMapping
    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }
}
