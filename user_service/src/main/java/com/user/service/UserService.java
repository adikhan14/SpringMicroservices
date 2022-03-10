package com.user.service;

import com.user.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User getUserById(Long userId);
}
