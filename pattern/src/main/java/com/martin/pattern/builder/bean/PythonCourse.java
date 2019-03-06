package com.martin.pattern.builder.bean;
/**
 * 功能描述
 * @Description Python课程
 * @Author guanxianchun
 * @Date 2019/3/6 23:15
 */
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("Python课程录播视频");
    }
}
