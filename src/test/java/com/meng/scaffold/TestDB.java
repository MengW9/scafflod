package com.meng.scaffold;

import com.meng.scaffold.dao.User;
import com.meng.scaffold.service.DataSourceTestService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description: 测试数据源连接是否成功
 * @author: MengW9
 * @create: 2019-09-11 18:49
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDB {

    /**
     * Spring Boot 默认已经配置好了数据源，程序员可以直接 DI 注入然后使用即可
     */
    @Resource
    DataSource dataSource;

    @Autowired
    private DataSourceTestService dataSourceTestService;

    @Test
    public void test(){
        // 数据源ONE
        User user1 = dataSourceTestService.test1(1L);
        System.out.println(ToStringBuilder.reflectionToString(user1));

        // 数据源TWO
        User user2 = dataSourceTestService.test2(1L);
        System.out.println(ToStringBuilder.reflectionToString(user2));

        // 数据源ONE
        User user3 = dataSourceTestService.test1(1L);
        System.out.println(ToStringBuilder.reflectionToString(user3));
    }

    @Test
    public void contextLoads() throws SQLException {

        System.out.println("数据源>>>>>>>" + dataSource.getClass());
        Connection connection = dataSource.getConnection();

        System.out.println("连接>>>>>>>>>" + connection);
        System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
        connection.close();
    }
}
