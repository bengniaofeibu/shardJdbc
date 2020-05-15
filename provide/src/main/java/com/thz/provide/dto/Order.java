package com.thz.provide.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_order")
public class Order {

    private Long id;
    @TableField("name")
    private String name;
    @TableField("type")
    private String type;
    @TableField("gmt_create")
    private Date gmtCreate;
}
