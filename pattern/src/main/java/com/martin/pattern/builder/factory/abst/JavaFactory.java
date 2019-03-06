package com.martin.pattern.builder.factory.abst;

import com.martin.pattern.builder.bean.ICourse;
import com.martin.pattern.builder.bean.INote;
import com.martin.pattern.builder.bean.JavaCourse;
import com.martin.pattern.builder.bean.JavaNote;


/**
 * 抽象工厂+工厂方法
 *
 * @author 管贤春
 * @时间 2018年12月23日 下午1:02:03
 * @Email psyche19830113@163.com
 * @Description
 */
public class JavaFactory extends AbstractFactory {


    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }

    @Override
    public INote getNote() {
        return new JavaNote();
    }
}
