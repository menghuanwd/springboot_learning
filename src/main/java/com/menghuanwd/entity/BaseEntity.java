package com.menghuanwd.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author guyifeng on 2021/1/14
 */
@Data
public class BaseEntity {
    private Integer id;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime created_at;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updated_at;

    @TableLogic("NULL")
    @JsonIgnore
    @TableField
    private LocalDateTime deleted_at;
}
