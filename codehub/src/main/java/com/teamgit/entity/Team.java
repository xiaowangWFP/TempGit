package com.teamgit.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@TableName("team")
@Schema(description = "团队实体")
public class Team {
    @TableId(type = IdType.AUTO)
    @Schema(description = "团队 ID", example = "1")
    private Long id;
    
    @Schema(description = "团队名称", example = "开发团队")
    private String name;

    @Schema(description = "团队所有者 ID", example = "1")
    private Long ownerId;
    
    @Schema(description = "团队描述", example = "负责核心功能开发")
    private String description;
    
    @Schema(description = "创建时间")
    private LocalDateTime create_time;
    
}
