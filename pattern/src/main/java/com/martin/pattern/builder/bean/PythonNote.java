package com.martin.pattern.builder.bean;

/**
 * 功能描述
 *
 * @ClassName PythonNote
 * @Description TODO
 * @Author guanxianchun
 * @Date 2019/3/6 23:11
 **/
public class PythonNote implements INote {
    @Override
    public void note() {
        System.out.println("Python笔记");
    }
}
