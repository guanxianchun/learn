package com.martin.pattern.struct.strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void test() {
        //下订单
        Order order = new Order("gxc", "order-1", 120.5);
        //开始支持,用户只需要选择支付方式
        PayStatus payStatus = order.pay(PayType.JD_PAY);
        //输出支持状态
        System.out.println(payStatus);
    }
}
