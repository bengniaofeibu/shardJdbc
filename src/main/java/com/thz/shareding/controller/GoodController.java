package com.thz.shareding.controller;

import com.thz.shareding.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;


    @PostMapping("/save")
    public String save(){
        return goodService.save();
    }
}
