package com.meng.scaffold.config.datasource;

import java.lang.annotation.*;

/**
 * @description: 多数据源注解
 * @author: MengW9
 * @create: 2019-11-28 10:31
 **/
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceNames.ONE;
}
