package com.thz.shareding.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.thz.shareding.dto.Order;
import com.thz.shareding.dto.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    User getUserInfo(@Param("id") Long id);

}