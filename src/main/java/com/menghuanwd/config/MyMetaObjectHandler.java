package com.menghuanwd.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author guyifeng on 2021/1/14
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasSetter("created_at")) {
            this.strictInsertFill(metaObject, "created_at", LocalDateTime.class, LocalDateTime.now());
            this.strictInsertFill(metaObject, "updated_at", LocalDateTime.class, LocalDateTime.now());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasSetter("updated_at")) {
            this.strictUpdateFill(metaObject, "updated_at", LocalDateTime.class, LocalDateTime.now());
        }
    }
}