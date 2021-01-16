package com.menghuanwd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.menghuanwd.dao.BusinessesDao;
import com.menghuanwd.entity.Businesses;
import com.menghuanwd.service.BusinessesService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-15
 */
@Service
public class BusinessesServiceImpl extends ServiceImpl<BusinessesDao, Businesses> implements BusinessesService {

}
