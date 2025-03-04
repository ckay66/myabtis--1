package org.example.test;
import mapper.UserMapper;
import org.apache.catalina.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.Util.MyBatisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
public class UserTest {
    SqlSession session;
    UserMapper mapper;
    @Before
    public void before(){
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        session = factory.openSession(true);
        mapper = session.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        session.close();
    }
    @Test
    public void selectAllUser(){
        List<User> users = mapper.selectAllUser();
        for(User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void updateNameById(){
        mapper.updateNameById(1,"aaa");
    }
    @Test
    public void selectById(){
        User user = mapper.selectById(1);
        System.out.println(user);
    }
    @Test
    public void insertUser(){
        User u=new User();
        u.setName("abavvvv");
        u.setSal(200);
        u.setBirthday(new Date());
        mapper.insertUser(u);
    }
    @Test
    public void deleteByArray(){
        int [] ids={10,11};
        mapper.deleteByArray(ids);
    }

    @Test
    public void selectLikeName(){
        List<User> users = mapper.selectLikeName("a");
        //4、打印测试
        for(User u:users){
            System.out.println(u);
        }
    }
}
