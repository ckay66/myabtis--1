package org.example.test;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.Util.MyBatisUtil;
import org.example.sp.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class UserTest {
    SqlSession session;
    UserMapper mapper;
    @Before
    public void a() {
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        session = factory.openSession(true);
        mapper = session.getMapper(UserMapper.class);

    }

    @After
    public void b() {
        //5、关闭资源
        session.close();
    }
    @Test
    public void selectAll1(){
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
    }
    @Test
    public void selectAll2(){
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
        mapper.selectAll();
        System.out.println("~~~~~~~~~");
    }
    @Test
    public void insertUser(){
        User u = new User("a",1,new Date());
        mapper.insertUser(u);
    }
    @Test
    public void insertUser1(){
        User u=new User("b",2,new Date());
        mapper.insertUser1(u);
        System.out.println(u);
    }
    @Test
    public void insertUser2(){
        User u=new User("c",3,new Date());
        mapper.insertUser2(u);
        System.out.println(u);
    }
}