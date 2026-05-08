package com.teamgit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamgit.entity.Team;
import com.teamgit.service.TeamService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/teams")
@Tag(name = "团队管理", description = "团队相关接口")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/create")
    @Operation(summary = "创建团队", description = "根据传入的团队信息创建新团队")
    public String createTeam(@RequestBody Team team) {
        boolean saved = teamService.save(team);
        return saved ? "团队创建成功" : "团队创建失败";
    }

    @GetMapping("/list")
    @Operation(summary = "获取所有团队", description = "返回系统中所有团队的列表")
    public List<Team> getAllTeams() {
        return teamService.list();
    }

}