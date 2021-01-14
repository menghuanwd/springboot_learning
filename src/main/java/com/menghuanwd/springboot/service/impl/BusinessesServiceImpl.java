package com.menghuanwd.springboot.service.impl;

import com.menghuanwd.springboot.entity.Businesses;
import com.menghuanwd.springboot.mapper.BusinessesMapper;
import com.menghuanwd.springboot.service.BusinessesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-14
 */
@Service
public class BusinessesServiceImpl extends ServiceImpl<BusinessesMapper, Businesses> implements BusinessesService {

}
