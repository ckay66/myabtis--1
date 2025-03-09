package org.example.test;
import mapper.AccountMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.Util.MyBatisUtil;
import org.example.sp.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class AccountTest {
    SqlSession session;
    AccountMapper mapper;
    @Before
    public void a() {
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        session = factory.openSession(true);
        mapper = session.getMapper(AccountMapper.class);
    }

    @After
    public void b() {
        session.close();
    }
    @Test
    public void insetAccount(){
        Account a=new Account(UUID.randomUUID().toString().replace("-",""),"rg2");
        mapper.insertAccount(a);
    }
    @Test
    public void insetAccount1(){
        Account a=new Account("rg2-1");
        mapper.insertAccount1(a);
    }
}