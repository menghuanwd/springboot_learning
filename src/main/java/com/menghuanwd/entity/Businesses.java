package com.menghuanwd.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author guyifeng
 * @since 2021-01-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Businesses extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String status;

    @TableField(value = "created_at", fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    @TableField(fill = FieldFill.INSERT)
    private String content;


}
