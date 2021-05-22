package com.example.springboottest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author feizai
 * @date 2021/5/15 0015 下午 7:33:04
 * @annotation
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
