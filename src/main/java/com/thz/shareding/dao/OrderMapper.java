package com.thz.shareding.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.thz.shareding.dto.Goods;
import com.thz.shareding.dto.GoodsExample;
import com.thz.shareding.dto.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {

}