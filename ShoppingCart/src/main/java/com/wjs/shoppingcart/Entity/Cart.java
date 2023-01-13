package com.wjs.shoppingcart.Entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王
 * 购物车
 */
@Data
public class Cart {
    /**
     * 商品清单
     */
    private List<Commodity> items = new ArrayList<>();
    /**
     * 总优惠
     */
    private BigDecimal totalDiscount;
    /**
     * 商品总价
     */
    private BigDecimal totalItemPrice;
    /**
     * 总运费
     */
    private BigDecimal totalDeliveryPrice;
    /**
     * 应付总价
     */
    private BigDecimal payPrice;
}

