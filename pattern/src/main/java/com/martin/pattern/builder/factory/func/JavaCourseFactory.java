package com.martin.pattern.builder.factory.func;

import com.martin.pattern.builder.bean.ICourse;
import com.martin.pattern.builder.bean.JavaCourse;

/**
 * 功能描述
 * @Description Java工厂专门生产Java课程
 * @Author guanxianchun
 * @Date 2019/3/6 23:26
 */
public class JavaCourseFactory implements Factory {

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
