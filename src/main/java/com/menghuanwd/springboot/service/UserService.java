package com.menghuanwd.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.menghuanwd.springboot.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface UserService extends IService<User> {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    public List<User> findAll() {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
//        queryWrapper.like("name", "J").lt("age", 20);
//        List<User> userList = userMapper.selectList(queryWrapper);
//
//        return userMapper.selectList(new QueryWrapper<>());
//    }
}
