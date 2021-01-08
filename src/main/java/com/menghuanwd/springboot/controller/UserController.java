package com.menghuanwd.springboot.controller;

import com.menghuanwd.springboot.domain.User;
import com.menghuanwd.springboot.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRespository userRespository;

    @Autowired
    public UserController(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name) {
        System.out.printf(name);
        User user = new User();
        user.setName(name);

        if (userRespository.save(user)) {
            System.out.printf("保存成功 %s\n", user);
        }

        return user;
    }

}
