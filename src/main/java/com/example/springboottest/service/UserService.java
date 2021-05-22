package com.example.springboottest.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.dao.UserDao;
import com.example.springboottest.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author feizai
 * @date 2021/5/15 0015 下午 7:35:17
 * @annotation
 */
@Service
public class UserService extends ServiceImpl<UserDao, User> implements UserServiceDao {

}
