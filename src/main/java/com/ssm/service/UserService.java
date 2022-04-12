package com.ssm.service;

import com.ssm.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> selectAll();

    public int insert(User user);

    public int deleteById(int id);
}
