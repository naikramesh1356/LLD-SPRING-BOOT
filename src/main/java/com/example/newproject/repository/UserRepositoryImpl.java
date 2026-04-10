package com.example.newproject.repository;

import com.example.newproject.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<Integer, User> users = new HashMap<>();

    public UserRepositoryImpl() {
        users.put(1, new User(1, "ADMIN"));
        users.put(2, new User(2, "USER"));
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }
}
