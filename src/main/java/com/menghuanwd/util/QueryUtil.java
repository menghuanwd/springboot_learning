package com.menghuanwd.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * Author: guyifeng
 * Date: 2021-01-16 15:38
 **/
@Data
public class QueryUtil<T> {
    private Page<T> page;
    private QueryWrapper<T> wrapper;
}
