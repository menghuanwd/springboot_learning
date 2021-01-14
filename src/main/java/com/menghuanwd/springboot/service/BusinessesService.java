package com.menghuanwd.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.menghuanwd.springboot.dto.LoginDTO;
import com.menghuanwd.springboot.entity.Businesses;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-14
 */
public interface BusinessesService extends IService<Businesses> {
    LoginDTO login(String username, String password);

    boolean saveBusiness(Businesses businesses);
}
