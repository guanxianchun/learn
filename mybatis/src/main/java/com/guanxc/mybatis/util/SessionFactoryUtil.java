package com.guanxc.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.InputStream;

public class SessionFactoryUtil {

    private static SqlSessionFactory sessionFactory;

    private SessionFactoryUtil() {
    }

    public static synchronized SqlSession getSession() throws Exception {
        if (sessionFactory==null){
            InputStream inputStream = Resources.getResourceAsStream("mybatis-conf.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }

        return sessionFactory.openSession();
    }

}
