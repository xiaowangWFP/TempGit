package com.teamgit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.teamgit.entity.Team;
//复杂逻辑接口，基于继承IService，提供了基本的CRUD方法，可以直接使用，无需编写SQL
public interface TeamService extends IService<Team> {
    
}
