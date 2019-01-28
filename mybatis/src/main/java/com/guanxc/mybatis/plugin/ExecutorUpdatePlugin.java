package com.guanxc.mybatis.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 自定义mybatis插件
 * @Author: guanxianchun
 * @Email: psyche19830113@163.com
 * @Date: 19-1-28 下午2:37
 */
@Intercepts({@Signature(type= Executor.class,method = "update",args = {MappedStatement.class,Object.class})})
public class ExecutorUpdatePlugin implements Interceptor {
    private static Logger logger = LoggerFactory.getLogger(ExecutorUpdatePlugin.class);
    public Object intercept(Invocation invocation) throws Throwable {
        logger.info("====> executor update method ..............."+invocation.getMethod());
        return invocation.proceed();
    }

    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }

    public void setProperties(Properties properties) {

    }
}
