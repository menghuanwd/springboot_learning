package com.menghuanwd.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.springframework.stereotype.Component;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * @author guyifeng on 2021/1/14
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("insertFill!!!!!22222");
        System.out.println(LocalDateTime.now());
//        if (metaObject.hasSetter("created_at")) {
//            System.out.println("insertFill!!!!!");
//        this.setFieldValByName("created_at", LocalDateTime.now(), metaObject);
//        this.fillStrategy(metaObject, "created_at", LocalDateTime.now().toLocalTime());
        this.strictInsertFill(metaObject, "created_at", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "updated_at", LocalDateTime.class, LocalDateTime.now());
//        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasSetter("updated_at")) {
            this.strictUpdateFill(metaObject, "updated_at", LocalDateTime.class, LocalDateTime.now());
        }
    }
}