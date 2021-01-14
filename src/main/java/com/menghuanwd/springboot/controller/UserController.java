package com.menghuanwd.springboot.controller;

import com.menghuanwd.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/person")
//    public Object list() {
//        return userService.findAll();
//    }
//
//    @PostMapping("/person/save")A
//    public User save(@RequestParam String name) {
//        System.out.printf(name);
//        User user = new User();
//        user.setName(name);
//
//        if (userService.save(user)) {
//            System.out.printf("保存成功 %s\n", user);
//        }
//
//        return user;
//    }

}
