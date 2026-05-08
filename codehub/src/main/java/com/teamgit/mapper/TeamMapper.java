package com.teamgit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.teamgit.entity.Team;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper extends BaseMapper<Team> {
    // 继承 BaseMapper 后，增删改查方法都自动有了，不需要写 SQL
}