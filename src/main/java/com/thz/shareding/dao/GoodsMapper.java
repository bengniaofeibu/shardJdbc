package com.thz.shareding.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.thz.shareding.dto.Goods;
import com.thz.shareding.dto.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface GoodsMapper extends BaseMapper<Goods> {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}