package com.menghuanwd.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName(value = "users")
public class User extends Model<User> {
    private static final long serialVersionUID = 1L;

    //    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
