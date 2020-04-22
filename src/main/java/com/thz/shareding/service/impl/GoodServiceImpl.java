package com.thz.shareding.service.impl;

import com.thz.shareding.dto.Goods;
import com.thz.shareding.dao.GoodsMapper;
import com.thz.shareding.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public String save(){
        for(int i= 1 ; i <= 40 ; i ++){
            Goods goods = new Goods();
            goods.setGoodsId((long) i);
            goods.setGoodsName( "shangpin" + i);
            goods.setGoodsType((long) (i+1));
            goodsMapper.insert(goods);
        }
        return "success";
    }
}
