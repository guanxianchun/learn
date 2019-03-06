package com.martin.pattern.builder.bean;
/**
 * 功能描述
 * @Description 具体的产品
 * @Author guanxianchun
 * @Date 2019/3/6 23:15
 */
public class JavaCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("Java课程录播视频");
    }
}
