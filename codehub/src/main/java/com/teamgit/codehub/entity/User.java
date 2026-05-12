package com.teamgit.codehub.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@TableName("user")
@Schema(description = "用户实体")
public class User {
    @TableId(type = IdType.AUTO)
    @Schema(description = "用户 ID", example = "1")
    private Long id;
    
    @Schema(description = "用户名称", example = "Jeo")
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)// 不显示密码字段 
    @Schema(description = "用户密码", example = "123456")
    private String password;

    @Schema(description = "用户邮箱", example = "user@example.com")
    private String email;
    
    @TableField(value = "create_time", fill = FieldFill.INSERT)// 在插入时自动填充时间   
    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    
}   
