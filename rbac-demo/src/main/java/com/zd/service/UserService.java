package com.zd.service;

import com.zd.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public User selectUser(User user);
}
