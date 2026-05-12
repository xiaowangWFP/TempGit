package com.teamgit.codehub.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.teamgit.codehub.entity.Team;

@Mapper
public interface TeamMapper extends BaseMapper<Team> {
    // 继承 BaseMapper 后，增删改查方法都自动有了，不需要写 SQL
}