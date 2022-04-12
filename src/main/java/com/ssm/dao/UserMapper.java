package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
//@Mapper 把mapper这个Dao交给spring容器管理
@Mapper
public interface UserMapper {

    public List<User> selectAll();

    public int insert(User user);

    public int deleteById(int id);

}
