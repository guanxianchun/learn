package com.guanxc.mybatis.bean;

interface IPayment{
    public void payment();
}

class AliPayment implements IPayment{

    public void payment() {
        System.out.println("阿里支付");
    }
}
public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
