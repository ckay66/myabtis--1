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
        //1、创建SqlSessionFactory对象，也是单例模式的
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        //2、创建SqlSession对象 true 自动提交事务 不写也没事 因为默认在sqlsession关闭时提交事务
        session = factory.openSession(true);
        //3、调用session的方法namespace的名字.id
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void b() {
        //5、关闭资源
        session.close();
    }

    @Test
    public void selectAll(){
        for (User user : mapper.selectAll()) {
            System.out.println(user);
        }
    }

    @Test
    public void selectUser_Role(){
        for (User user : mapper.selectUser_Role()) {
            System.out.println(user);
        }
    }
}