package com.menghuanwd;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.menghuanwd.dao.BusinessesDao;
import com.menghuanwd.dao.UserDao;
import com.menghuanwd.entity.Businesses;
import com.menghuanwd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OptTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BusinessesDao businessesDao;

    @Test
    public void insertBusiness() {
        Businesses user = new Businesses();
        user.setName("aaa222");
        user.setVersion(3);

        int rows = businessesDao.insert(user);

        System.out.println(rows);


    }

    @Test
    public void insert() {
        User user = new User();
        user.setName("aaa");
        user.setAge(3);
        user.setMyEmail("22@qq.com");
        user.setRemark("remark");

        int rows = userDao.insert(user);

        System.out.println(rows);
    }

    @Test
    public void selectByWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.like("name", "J").lt("age", 20);
        List<User> userList = userDao.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void selectByWrapper2() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.between("age", 20, 40).isNotNull("email");
        List<User> userList = userDao.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void selectLambda() {
//        LambdaQueryWrapper<User> lambda =  new QueryWrapper<User>().lambda();
//        LambdaQueryWrapper<User> lambd3 =  new LambdaQueryWrapper<User>();
        LambdaQueryWrapper<User> lambda2 = Wrappers.<User>lambdaQuery();
        lambda2.like(User::getName, "g");
        List<User> userList = userDao.selectList(lambda2);

        userList.forEach(System.out::println);
    }

    @Test
    public void selectLambda2() {
        System.out.println("----selectLambda2------");
        List<User> userList = new LambdaQueryChainWrapper<User>(userDao).like(User::getName, "J").list();

        userList.forEach(System.out::println);
    }

    @Test
    public void selectPage(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.gt("age", 10);

//        LambdaQueryWrapper<User> lambda2 = Wrappers.<User>lambdaQuery();
//        lambda2.like(User::getName, "J");

        Page<User> page = new Page<User>(2, 2);

        IPage<User> iPage = userDao.selectPage(page, queryWrapper);

        System.out.println("总页数" + iPage.getPages());
        System.out.println("总记录数" + iPage.getTotal());

        List<User> userList = iPage.getRecords();

        userList.forEach(System.out::println);

        System.out.println("OVER");
    }
}
