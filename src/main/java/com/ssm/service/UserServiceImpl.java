package com.ssm.service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
//@Repository 作用于dao层，它注解的类作为Dao对象可以直接对数据库进行操作
@Repository("userService")
@Service
public class UserServiceImpl implements UserService {

    //@Autowired 实现依赖注入
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    @Override
    public int insert(User user){
        return userMapper.insert(user);
    }

    @Override
    public int deleteById(int id){
        return userMapper.deleteById(id);
    }

    @Override
    public int updateById(User user){
        return userMapper.updateById(user);
    }


}
