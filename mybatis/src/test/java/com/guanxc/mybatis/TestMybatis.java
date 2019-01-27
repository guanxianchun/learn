package com.guanxc.mybatis;

import com.guanxc.mybatis.bean.User;
import com.guanxc.mybatis.mapper.UserMapper;
import com.guanxc.mybatis.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMybatis {

    @Test
    public void findUser() throws Exception {
        SqlSession sqlSession = SessionFactoryUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey("000f5bac-0fe9-11e9-adbd-0017fa005622");
        if (null != user) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
