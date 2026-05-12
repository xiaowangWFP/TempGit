package com.teamgit.codehub.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.teamgit.codehub.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 继承 BaseMapper 后，增删改查方法都自动有了，不需要写 SQL
}