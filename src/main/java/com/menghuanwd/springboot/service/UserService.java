package com.menghuanwd.springboot.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.menghuanwd.springboot.entity.User;
import com.menghuanwd.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.like("name", "J").lt("age", 20);
        List<User> userList = userMapper.selectList(queryWrapper);

        return userMapper.selectList(new QueryWrapper<>());
    }
}
