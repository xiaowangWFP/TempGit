package com.teamgit.codehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamgit.codehub.entity.User;
import com.teamgit.codehub.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/users")
@Tag(name = "用户管理", description = "用户相关接口")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @Operation(summary = "创建用户", description = "根据传入的用户信息创建新用户")
    public String register(@RequestBody User user) {
        boolean saved = userService.save(user);
        return saved ? "用户创建成功" : "用户创建失败";
    }

    @GetMapping("/list")
    @Operation(summary = "获取所有用户", description = "返回系统中所有用户的列表")
    public List<User> getAllUsers() {
        return userService.list();
    }
}