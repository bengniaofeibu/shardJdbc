package com.service.shareding.vo;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class SentinelFallback {

    public static Result blockHandle(Long id, BlockException e){
        System.out.println(e.getRule().getLimitApp());
        System.out.println(id);
        return Result.returnFail("你被限流了");
    }

    public static Result selectUserInfoFallback(Long id) {
        System.out.println(id);
        return Result.returnFail("你被降级了");
    }
}
