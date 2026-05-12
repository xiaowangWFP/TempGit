package com.teamgit.codehub.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjecthandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (getFieldValByName("createTime", metaObject) == null) {
            setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
/*更新方法，如需使用删掉注释      if (getFieldValByName("updateTime", metaObject) == null) {
            setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        } */ 
    }
 
}