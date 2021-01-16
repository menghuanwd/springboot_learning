package com.menghuanwd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.menghuanwd.dao.UserDao;
import com.menghuanwd.entity.User;
import com.menghuanwd.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
