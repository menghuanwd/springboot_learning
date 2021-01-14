package com.menghuanwd;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.menghuanwd.dao.BusinessesDao;
import com.menghuanwd.dao.UserDao;
import com.menghuanwd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class destroyTests {

    @Autowired
    private UserDao userMapper;

    @Autowired
    private BusinessesDao businessesDao;

    @Test
    public void deleteBusinessById() {
        int rows = businessesDao.deleteById(4);

        System.out.println(rows);
    }

    @Test
    public void deleteById() {
        int rows = userMapper.deleteById(1L);

        System.out.println(rows);
    }

    @Test
    public void deleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("age", 24);

        int rows = userMapper.deleteByMap(map);
        System.out.println(rows);
    }

    @Test
    public void deleteByLambda() {
        LambdaQueryWrapper<User> lambda = new LambdaQueryWrapper<User>();
        lambda.eq(User::getAge, 3);

        int rows = userMapper.delete(lambda);
        System.out.println(rows);
    }
}
