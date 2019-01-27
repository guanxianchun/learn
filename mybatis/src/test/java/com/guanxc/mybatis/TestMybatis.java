package com.guanxc.mybatis;

import com.guanxc.mybatis.bean.User;
import com.guanxc.mybatis.mapper.UserMapper;
import com.guanxc.mybatis.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

public class TestMybatis {
    public static void main(String[] args) throws Exception{
        SqlSession sqlSession = SessionFactoryUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey("000f5bac-0fe9-11e9-adbd-0017fa005622");
        System.out.println(user.getLoginName());
        sqlSession.close();

    }
}
