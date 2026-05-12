package com.teamgit.codehub.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teamgit.codehub.entity.User;
import com.teamgit.codehub.service.UserService;
import com.teamgit.codehub.mapper.UserMapper;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    

}
