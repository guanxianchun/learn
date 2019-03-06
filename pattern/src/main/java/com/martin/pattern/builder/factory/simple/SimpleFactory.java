package com.martin.pattern.builder.factory.simple;
import com.martin.pattern.builder.bean.ICourse;
import com.martin.pattern.builder.bean.JavaCourse;
import com.martin.pattern.builder.bean.PythonCourse;

/**
 * 简单工厂模式：小作坊(什么都可以生产，三无产品)
 *
 * @author 管贤春
 * @时间 2018年12月23日 下午12:03:02
 * @Email psyche19830113@163.com
 * @Description
 */
public class SimpleFactory {

    public ICourse getCar(String name) {
        if ("Java".equals(name)) {
            return new JavaCourse();
        } else if ("Python".equals(name)) {
            return new PythonCourse();
        } else {
            System.out.println("不能生产所需的课程");
            return null;
        }

    }

}
