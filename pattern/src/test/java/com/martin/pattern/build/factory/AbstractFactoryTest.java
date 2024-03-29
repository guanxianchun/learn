package com.martin.pattern.build.factory;

import com.martin.pattern.builder.factory.abst.AbstractFactory;
import com.martin.pattern.builder.factory.abst.JavaFactory;
import org.junit.Test;

/**
 * @author 管贤春
 * @时间 2018年12月23日 下午1:55:27
 * @Email psyche19830113@163.com
 * @Description
 */
public class AbstractFactoryTest {
    @Test
    public void test() {
        //用户通过MilkFactory对象的相应的方法就可以获取相应的产品
        AbstractFactory factory = new JavaFactory();
        //在这里用户只有选择的权力，程序具有很好的健壮性
        factory.getCourse().record();
        factory.getNote().note();
    }
}
