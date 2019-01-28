package com.guanxc.mybatis;

import com.guanxc.mybatis.bean.User;
import com.guanxc.mybatis.mapper.UserMapper;
import com.guanxc.mybatis.util.NumberUtil;
import com.guanxc.mybatis.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestMybatis {

    @Test
    public void findUser() throws Exception {
        SqlSession sqlSession = SessionFactoryUtil.getSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.selectByPrimaryKey(1l);
            if (null != user) {
                System.out.println(user.toString());
            }
        }catch (Exception e){
            throw e;
        }finally {
            sqlSession.close();
        }

    }
    @Test
    public void insert()throws Exception{
        User user = new User();
        user.setId(2l);
        user.setUserName("gxc");
        user.setAge(NumberUtil.intToByte(30));
        user.setAddress("湖南长沙");
        user.setSex("男");
        SqlSession sqlSession = SessionFactoryUtil.getSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int rows = userMapper.insert(user);
            System.out.println("save user success:"+rows);
            sqlSession.commit();
        }catch (Exception e){
            throw e;
        }finally {
            sqlSession.close();
        }
    }
}
