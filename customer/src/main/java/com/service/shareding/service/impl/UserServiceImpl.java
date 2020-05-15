package com.service.shareding.service.impl;

import com.service.shareding.dao.UserMapper;
import com.thz.provide.UserService;
import com.thz.provide.dto.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Service(interfaceClass = UserService.class)
@RefreshScope
public class UserServiceImpl implements UserService {

    @Value("${user.name}")
    private String name;

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private AddressMapper addressMapper;

    @Override
    public String getUserInfo() {
        return name;
    }

    @Override
    public String addUserInfo() {
        for (int i = 0 ; i< 100 ; i++){
            User user = new User();
            user.setName("小明"+i);
            user.setAge(i);
            userMapper.insert(user);

//            Address address = new Address();
//            address.setUserId(user.getId());
//            address.setAddress("小区"+i);
//            addressMapper.insert(address);
        }
        return "success";
    }
}
