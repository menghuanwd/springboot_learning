package com.menghuanwd;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.menghuanwd.dao.UserDao;
import com.menghuanwd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class updateTests {

    @Autowired
    private UserDao userMapper;

    @Test
    public void updatedById() {
        User user = new User();
        user.setId(1);
        user.setName("guyifeng");
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }

    @Test
    public void updateByWrapper() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<User>();
        updateWrapper.eq("name", "guyifeng");
        User user = new User();
        user.setAge(1000 );
        int rows = userMapper.update(user, updateWrapper);

        System.out.println(rows);
    }

    @Test
    public void updateByWrapper2() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<User>();
        updateWrapper.eq("name", "guyifeng").set("age", 1033);

        int rows = userMapper.update(null, updateWrapper);

        System.out.println(rows);
    }

    @Test
    public void updateByWrapperLambda() {
        LambdaUpdateWrapper<User> lambdaUpdateWrapper = new LambdaUpdateWrapper<User>();
        lambdaUpdateWrapper.eq(User::getName, "guyifeng").set(User::getAge, 1033);

        int rows = userMapper.update(null, lambdaUpdateWrapper);

        System.out.println(rows);
    }
}
