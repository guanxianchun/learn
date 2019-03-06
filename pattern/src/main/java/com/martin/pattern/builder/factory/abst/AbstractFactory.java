package com.martin.pattern.builder.factory.abst;

import com.martin.pattern.builder.bean.ICourse;
import com.martin.pattern.builder.bean.INote;

/**
 * 抽象工厂方法：
 * 要增加新的功能，只需要扩展新的功能（添加新的方法）
 *
 * @author 管贤春
 * @时间 2018年12月23日 下午12:56:32
 * @Email psyche19830113@163.com
 * @Description
 */
public abstract class AbstractFactory {
    /**
     * 功能描述
     * @Description 定义获取课程接口
     * @Author guanxianchun
     * @Date 2019/3/6 23:17
     */
    public abstract ICourse getCourse();
    /**
     * 功能描述
     * @Description 定义获取笔记接口
     * @Author guanxianchun
     * @Date 2019/3/6 23:17
     */
    public abstract INote getNote();

}
