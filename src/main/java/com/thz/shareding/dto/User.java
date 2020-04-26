package com.thz.shareding.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

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
