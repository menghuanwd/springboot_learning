package com.menghuanwd.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.menghuanwd.springboot.entity.User;
import com.menghuanwd.springboot.dao.UserDao;
import com.menghuanwd.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
