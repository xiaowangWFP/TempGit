package com.teamgit.codehub.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.teamgit.codehub.entity.User;
//复杂逻辑接口，基于继承IService，提供了基本的CRUD方法，可以直接使用，无需编写SQL
public interface UserService extends IService<User> {
    
}
