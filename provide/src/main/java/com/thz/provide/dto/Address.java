package com.thz.provide.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("t_address")
public class Address {

    private Long id;
    @TableField("user_id")
    private Long userId;
    @TableField("address")
    private String address;
}
