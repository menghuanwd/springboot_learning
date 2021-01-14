package com.menghuanwd.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.menghuanwd.springboot.dto.LoginDTO;
import com.menghuanwd.springboot.entity.Businesses;
import com.menghuanwd.springboot.mapper.BusinessesMapper;
import com.menghuanwd.springboot.service.BusinessesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-14
 */
@Service
public class BusinessesServiceImpl extends ServiceImpl<BusinessesMapper, Businesses> implements BusinessesService {

    @Autowired
    private BusinessesMapper businessesMapper;

    @Override
    public LoginDTO login(String username, String password) {
        LoginDTO loginDTO = new LoginDTO();
        Businesses bussiness = lambdaQuery().eq(Businesses::getName, username).one();

        if (bussiness == null) {
            return loginDTO;
        }
        loginDTO.setBusinesses(bussiness);

        return loginDTO;
    }

    @Override
    public boolean save2(Businesses businesses) {
        save(businesses);
//        businesses.getName();

        return true;
//        businessesMapper.insert(businesses);
//        return 1 == businessesMapper.insert(businesses);
//
//        return bool == 1;

//        LoginDTO loginDTO = new LoginDTO();
//        Businesses bussiness2 = lambdaQuery().eq(Businesses::getName, username).one();
//
//        if (bussiness2 == null) {
//            return loginDTO;
//        }
//        loginDTO.setBusinesses(bussiness2);
//
//        return loginDTO;
    }
}
