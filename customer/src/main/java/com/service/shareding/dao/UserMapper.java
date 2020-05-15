package com.service.shareding.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.thz.provide.dto.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    User getUserInfo(@Param("id") Long id);

}