package com.martin.pattern.builder.factory.func;

import com.martin.pattern.builder.bean.ICourse;
import com.martin.pattern.builder.bean.PythonCourse;

/**
 * Python工厂专门生产Python
 *
 * @author 管贤春
 * @时间 2018年12月23日 下午12:46:33
 * @Email psyche19830113@163.com
 * @Description
 */
public class PythonCourseFactory implements Factory {

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
