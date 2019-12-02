package com.meng.scaffold.service;

import com.meng.scaffold.config.datasource.DataSource;
import com.meng.scaffold.config.datasource.DataSourceNames;
import com.meng.scaffold.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 测试多数据源
 * @author: MengW9
 * @create: 2019-11-28 10:39
 **/
@Service
public class DataSourceTestService {

    @Autowired
    private UserService userService;

    public User test1(Long userId) {
        return userService.selectById(userId);
    }

    /**
     * @Description： 多数据注解必须放在接口实现类的上面
     * @Param： [userId]
     * @Author： MengW9
     */
    @DataSource(DataSourceNames.TWO)
    public User test2(Long userId) {
        return userService.selectById(userId);
    }

}
