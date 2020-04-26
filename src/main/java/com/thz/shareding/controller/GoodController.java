package com.thz.shareding.controller;

import com.thz.shareding.dto.Order;
import com.thz.shareding.dto.User;
import com.thz.shareding.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;




    @PostMapping("/save")
    public String save(){
        return goodService.save();
    }

    @PostMapping("/save/order")
    public String saveOrder(){
        return goodService.saveOrder();
    }

    @GetMapping("/select/order")
    public Order selectById(Long id){
        return goodService.selectById(id);
    }

    @PostMapping("/save/user")
    public String saveUser(){
        return goodService.saveUser();
    }

    @GetMapping("/select/user")
    public User selectUserById(Long id){
        return goodService.selectUser(id);
    }

    @GetMapping("/select/user/info")
    public User selectUserInfo(Long id){
        return goodService.selectUserInfo(id);
    }
}
