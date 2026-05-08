package com.teamgit.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teamgit.entity.Team;
import com.teamgit.mapper.TeamMapper;
import com.teamgit.service.TeamService;
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements TeamService {
    

}
