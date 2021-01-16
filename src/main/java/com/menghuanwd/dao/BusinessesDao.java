package com.menghuanwd.dao;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.menghuanwd.entity.Businesses;
import com.menghuanwd.vo.ResourceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-15
 */
public interface BusinessesDao extends BaseMapper<Businesses> {
    List<ResourceVO> listResource(@Param(Constants.WRAPPER) QueryWrapper<Businesses> wrapper);
}
