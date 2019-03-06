package com.martin.pattern.builder.bean;

/**
 * 功能描述
 *
 * @ClassName JavaNote
 * @Description TODO
 * @Author guanxianchun
 * @Date 2019/3/6 23:11
 **/
public class JavaNote implements INote{
    @Override
    public void note() {
        System.out.println("Java笔记");
    }
}
