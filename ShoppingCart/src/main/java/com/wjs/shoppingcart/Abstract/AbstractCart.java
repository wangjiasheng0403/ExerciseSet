package com.wjs.shoppingcart.Abstract;

import com.wjs.shoppingcart.Dao.CommodityDao;
import com.wjs.shoppingcart.Entity.Cart;
import com.wjs.shoppingcart.Entity.Commodity;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 王
 * 购物车处理的抽象类
 */
public abstract class AbstractCart {

    @Resource
    private  CommodityDao commodityDao;
    /**
     * 处理购物车的大量重复逻辑在父类实现
     */
    public Cart process(long userId, Map<Long, Integer> items){

        Cart cart = new Cart();

        List<Commodity> itemList = new ArrayList<>();
        //使用Java 8中的Stream API和lambda表达式来遍历一个Map的条目
        items.entrySet().stream().forEach(entry -> {
            Commodity item = new Commodity();
            item.setId(entry.getKey());
            item.setPrice(commodityDao.selectByPrimaryKey(entry.getKey()).getPrice());

        });

        return cart;
    }
}
