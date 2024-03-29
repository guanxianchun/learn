package com.martin.pattern.build.factory;

import com.martin.pattern.builder.factory.func.Factory;
import com.martin.pattern.builder.factory.func.JavaCourseFactory;
import org.junit.Test;

/**
 * @author 管贤春
 * @时间 2018年12月23日 下午12:49:17
 * @Email psyche19830113@163.com
 * @Description
 */
public class FactoryFuncTest {
    @Test
    public void test() {
        //用户要产品先要选择相应的工厂
        //用户要配置相应的工厂，可能存在配置错误的问题
        Factory factory = new JavaCourseFactory();
        factory.createCourse().record();
    }
}
