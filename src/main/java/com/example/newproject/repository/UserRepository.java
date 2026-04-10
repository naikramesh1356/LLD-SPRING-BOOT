package com.example.newproject.repository;

import com.example.newproject.model.User;

public interface UserRepository {
    User findById(int id);
}
