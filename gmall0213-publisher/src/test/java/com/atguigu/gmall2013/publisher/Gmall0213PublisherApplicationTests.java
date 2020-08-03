package com.atguigu.gmall2013.publisher;

import com.atguigu.gmall2013.publisher.bean.HourAmount;
import com.atguigu.gmall2013.publisher.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Gmall0213PublisherApplicationTests {

    @Autowired
    OrderService orderService;




    @Test
    public void contextLoads() {
        List<Map> trademarkSum = orderService.getTrademarkSum("2020-07-31", "2020-08-01");
        for (Map map : trademarkSum) {
            System.out.println(map.get("tm_name")+"::"+map.get("amount"));
        };

//        Map orderHourAmount = orderService.getOrderHourAmount("2020-08-01");
//        for (Object o : orderHourAmount.entrySet()) {
//            Map.Entry o1 = (Map.Entry) o;
//            System.out.println(o1.getKey()+"::"+o1.getValue());
//        }

    }

}
