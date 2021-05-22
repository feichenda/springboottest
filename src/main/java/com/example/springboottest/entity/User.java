package com.example.springboottest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("User")
public class User {
    Integer id;
    String username;
    String password;
    String role;
}
