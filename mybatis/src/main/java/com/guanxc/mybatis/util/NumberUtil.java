package com.guanxc.mybatis.util;

public class NumberUtil {

    public static Byte intToByte(int num){
        return new Byte((byte) (num & 0xFF));
    }
}
