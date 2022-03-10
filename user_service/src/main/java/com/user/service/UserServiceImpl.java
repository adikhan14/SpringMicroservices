package com.user.service;

import com.user.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    List<User> users = Arrays.asList(
            new User(1L,"Adil","03124539193"),
            new User(2L,"Abdul Majid","03124539192"),
            new User(3L,"Ali","03124539191"));

    @Override
    public User getUserById(Long userId) {
        return users.stream().filter(user -> user.getId().equals(userId)).findAny().orElse(null);
    }
}
