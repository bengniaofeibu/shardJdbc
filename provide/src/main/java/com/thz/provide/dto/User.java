package com.thz.provide.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {

    private Long id;
    @TableField("name")
    private String name;
    @TableField("age")
    private Integer age;

    private Address address;
}
