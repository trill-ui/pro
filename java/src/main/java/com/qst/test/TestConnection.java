package com.qst.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestConnection {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test

    public void test(){
        int row = jdbcTemplate.update("insert into sys_role values(null,?,?)", "lisi2", "123456");
        System.out.println(row);
    }
}
