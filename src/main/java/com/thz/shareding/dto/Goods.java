package com.thz.shareding.dto;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_goods")
public class Goods extends Model<Goods> {
    @TableId(value = "goods_id")
    private Long goodsId;
    @TableField(value = "goods_name")
    private String goodsName;
    @TableField(value = "goods_type")
    private Long goodsType;

    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }
}