package com.wjs.shoppingcart.Dao;

import com.wjs.shoppingcart.Entity.Commodity;
import org.springframework.stereotype.Component;

@Component
public interface CommodityDao {
    int deleteByPrimaryKey(Long id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}