package com.meng.scaffold;

import com.meng.scaffold.config.datasource.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 动态数据源配置,需要将自有的配置依赖(DynamicDataSourceConfig),将原有的依赖去除(DataSourceAutoConfiguration)
 * exclude = DataSourceAutoConfiguration.class
 * @author Meng
 */
@Import({DynamicDataSourceConfig.class})
@MapperScan("com.meng.scaffold.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceApplication.class, args);
    }
}
