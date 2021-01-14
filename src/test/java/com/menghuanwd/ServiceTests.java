package com.menghuanwd;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.menghuanwd.entity.User;
import com.menghuanwd.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void getOne() {
        User one = userService.getOne(Wrappers.<User>lambdaQuery().gt(User::getAge, 25), false);
        System.out.println(one.getAge());
    }

    @Test
    public void chainQuery() {
        List<User> list = userService.lambdaQuery().gt(User::getAge, 2).list();
        list.forEach(System.out::println);
    }

    @Test
    public void chainUpdate() {
        boolean bool = userService.lambdaUpdate().gt(User::getAge, 2).set(User::getName, "iiiiii").update();
        System.out.println(bool);
    }
}
