package com.thz.shareding.service.impl;

import com.thz.shareding.dao.AddressMapper;
import com.thz.shareding.dao.OrderMapper;
import com.thz.shareding.dao.UserMapper;
import com.thz.shareding.dto.Address;
import com.thz.shareding.dto.Goods;
import com.thz.shareding.dao.GoodsMapper;
import com.thz.shareding.dto.Order;
import com.thz.shareding.dto.User;
import com.thz.shareding.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AddressMapper addressMapper;

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

    @Override
    public String saveOrder() {
        for (int i = 0 ; i< 100 ; i++){
            Order order = new Order();
            order.setName("电脑"+i);
            order.setType("办公");
            orderMapper.insert(order);
        }
        return null;
    }
    @Override
    public Order selectById(Long id){
        Order order  = orderMapper.selectById(id);
       return order;
    }

    @Override
    public String saveUser() {
        for (int i = 0 ; i< 100 ; i++){
            User user = new User();
            user.setName("小明"+i);
            user.setAge(i);
            userMapper.insert(user);

            Address address = new Address();
            address.setUserId(user.getId());
            address.setAddress("小区"+i);
            addressMapper.insert(address);
        }
        return "success";
    }

    @Override
    public User selectUser(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectUserInfo(Long id) {
        return userMapper.getUserInfo(id);
    }
}
