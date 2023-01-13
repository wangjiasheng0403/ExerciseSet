package com.wjs.shoppingcart;

import com.wjs.shoppingcart.Dao.CommodityDao;
import com.wjs.shoppingcart.Entity.Commodity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private CommodityDao commodityDao;

    @Test
    void contextLoads() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        CommodityDao commodityDao = context.getBean(CommodityDao.class);

        Commodity commodity = new Commodity();
        commodity.setId(1L);
        commodity.setPrice(BigDecimal.valueOf(5));
        commodity.setQuantity(1);
        commodity.setCouponprice(BigDecimal.valueOf(0));
        commodity.setDeliveryprice(BigDecimal.valueOf(6));
        commodityDao.insert(commodity);
        System.out.println("ceshi");
    }

}
