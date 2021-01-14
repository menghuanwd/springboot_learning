package com.menghuanwd.springboot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

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

    private String content;

    private String fromurl;

    private String tourl;


}
