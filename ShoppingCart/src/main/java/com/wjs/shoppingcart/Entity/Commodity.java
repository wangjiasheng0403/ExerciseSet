package com.wjs.shoppingcart.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * commodity
 * @author 
 */
@Data
public class Commodity implements Serializable {
    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 商品优惠
     */
    private BigDecimal couponprice;

    /**
     * 商品运费
     */
    private BigDecimal deliveryprice;

    private static final long serialVersionUID = 1L;
}