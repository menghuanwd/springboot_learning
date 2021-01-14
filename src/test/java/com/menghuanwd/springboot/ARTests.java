package com.menghuanwd.springboot;

import com.menghuanwd.springboot.entity.User;
import com.menghuanwd.springboot.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ARTests {

    @Autowired
    private UserDao userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("a奥奥33aa");
        user.setAge(29);
        user.setMyEmail("22@qq.com");
        user.setRemark("remark");
        boolean bool = user.insert();

        System.out.println(bool);
    }

    @Test
    public void selectById() {
        User user = new User();
        user.setId(4);
        User newUser = user.selectById();
//        User newUser = user.selectById(2);

        System.out.println(newUser.getAge());
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setId(4);
        user.setAge(293);
        boolean bool = user.updateById();

        System.out.println(bool);
    }

    @Test
    public void destroyById() {
        User user = new User();
        user.setId(3);
        boolean bool = user.deleteById();

        System.out.println(bool);
    }

    @Test
    public void insertOrUpdate(){
        User user= new User();

        user.setId(3);
        user.setName("xxxxxxaisisi");

        boolean bool = user.insertOrUpdate();

        System.out.println(bool);
    }
}
