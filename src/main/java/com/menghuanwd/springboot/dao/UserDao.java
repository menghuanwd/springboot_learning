package com.menghuanwd.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.menghuanwd.springboot.entity.User;

public interface UserDao extends BaseMapper<User> {
//    @Select("select * from users ${ew.customSqlSegment}")
//    List<User> selectAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
