package com.menghuanwd.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "users")
public class User {

//    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    private String name;
    private Integer age;

    @TableField("email")
    private String myEmail;

    @TableField(exist = false)
    private String remark;

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        User.desc = desc;
    }

    private static String desc;
}
