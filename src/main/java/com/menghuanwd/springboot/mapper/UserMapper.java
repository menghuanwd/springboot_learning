package com.menghuanwd.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.menghuanwd.springboot.entity.User;

public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from users ${ew.customSqlSegment}")
//    List<User> selectAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
