package com.service.shareding.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Slf4j
public class GoodController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodController.class);

    @GetMapping("/get/goods")
    public String getGoods(){
        throw  new NullPointerException();
//        return "1苹果";
    }


    @GetMapping("/log")
    public void logBack(){
        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");

    }
}
