package com.example.valgykla.service.user;

import com.example.valgykla.model.User;

public interface UserService {
    User findByUsername(String username);
    void save(User user);
}
