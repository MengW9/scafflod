package com.meng.scaffold.service.impl;

import com.meng.scaffold.dao.User;
import com.meng.scaffold.mapper.UserMapperExt;
import com.meng.scaffold.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: scaffold
 * @description:
 * @author: MengW9
 * @create: 2019-11-28 10:48
 **/
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapperExt userMapperExt;

    @Override
    public User selectById(Long id) {
        return userMapperExt.selectByPrimaryKey(id.intValue());
    }
}
