package com.meng.scaffold.service;

import com.meng.scaffold.dao.User;

/**
 * @author issuser
 */
public interface UserService {

    User selectById(Long id);
}
