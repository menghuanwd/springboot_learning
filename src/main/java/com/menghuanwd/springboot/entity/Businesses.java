package com.menghuanwd.springboot.entity;

import java.time.LocalDate;
import java.io.Serializable;
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
@EqualsAndHashCode(callSuper = false)
public class Businesses implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String status;

    private LocalDate createdat;

    private String content;

    private String fromurl;

    private String tourl;


}
