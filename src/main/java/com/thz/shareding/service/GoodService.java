package com.thz.shareding.service;

import com.thz.shareding.dto.Order;
import com.thz.shareding.dto.User;

public interface GoodService {

    String save();

    String saveOrder();

    Order selectById(Long id);

    String saveUser();

    User selectUser(Long id);

    User selectUserInfo(Long id);
}
