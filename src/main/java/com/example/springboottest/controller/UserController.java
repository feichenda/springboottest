package com.example.springboottest.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboottest.entity.User;
import com.example.springboottest.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author feizai
 * @date 2021/5/15 0015 下午 7:31:19
 * @annotation
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserServiceDao userServiceDao;

    @GetMapping("/find")
    public String find() {

        Page<User> page = new Page<>(1, 10);
        Page<User> userPage = userServiceDao.page(page);

        List<User> list = userPage.getRecords();
        return list.toString();
    }

    @GetMapping("/findAll")
    public String findAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("username");
        List<User> list = userServiceDao.list();
        return list.toString();
    }

    @GetMapping("/findByName")
    public String find(String name) {
        List<User> list = userServiceDao.list(new QueryWrapper<User>().likeRight("username",name));
        return list.toString();
    }
}
