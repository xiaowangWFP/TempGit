package com.teamgit.codehub.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teamgit.codehub.entity.Team;
import com.teamgit.codehub.service.TeamService;
@Service
public class TeamServiceImpl extends ServiceImpl<BaseMapper<Team>, Team> implements TeamService {
    

}
