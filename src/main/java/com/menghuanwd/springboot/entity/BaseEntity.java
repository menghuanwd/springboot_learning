package com.menghuanwd.springboot.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author guyifeng on 2021/1/14
 */
@Data
public class BaseEntity {

    private Integer id;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;
}
