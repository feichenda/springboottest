package com.example.springboottest.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboottest.entity.User;
import com.example.springboottest.service.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author feizai
 * @date 2021/5/15 0015 下午 7:31:19
 * @annotation
 */
@Controller
public class IndexController {



    @GetMapping("/index")
    public String find() {
        return "index";
    }

}
