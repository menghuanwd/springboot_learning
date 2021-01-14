package com.menghuanwd.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.menghuanwd.springboot.dto.LoginDTO;
import com.menghuanwd.springboot.entity.Businesses;
import com.menghuanwd.springboot.service.BusinessesService;
import com.menghuanwd.springboot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-14
 */
@RestController
@RequestMapping("/businesses")
public class BusinessesController {

    @Autowired
    private BusinessesService businessesService;

    /**
     * test
     * @param username
     * @param password
     * @return
     */
    public String login(String username, String password){

        LoginDTO loginDTO = businessesService.login(username, password);

        return loginDTO.getBusinesses().getName();
    }

    @GetMapping("list")
    @ResponseBody
    public R<Map<String, Object>> list(String name, Long page, Long limit) {
        LambdaQueryWrapper<Businesses> wrapper = new LambdaQueryWrapper<Businesses>();
        wrapper.orderByDesc(Businesses::getId);
        Page<Businesses> myPage = businessesService.page(new Page<>(page, limit), wrapper);

        return ResultUtil.buildPageR(myPage);
    }

    @PostMapping
    @ResponseBody
    public  R<Object> add(@RequestBody Businesses businesses) {
        boolean success = BusinessesService.save2(businesses);

        return ResultUtil.buildR(success);
    }
}

