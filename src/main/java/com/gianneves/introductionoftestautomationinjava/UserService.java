package com.gianneves.introductionoftestautomationinjava;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> create(User user) {
        if (users.contains(user)) {
            throw new RuntimeException();
        }
        users.add(user);
        return users;
    }
}
