package com.cnepay.springstudy.mutidatabase;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MutiDatabaseConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.master")
    public DataSource masterDataSource(){
        DruidDataSource druid = new DruidDataSource();
        return druid;
    }
    @Bean
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource slaveDataSource(){
        DruidDataSource druid = new DruidDataSource();
        return druid;
    }
    @Bean
    public DataSource myRoutingDataSource(@Qualifier("masterDataSource") DataSource masterDataSource,
                                           @Qualifier("slaveDataSource") DataSource slaveDataSource ){
        MyRoutingDataSource myRouteingDataSource = new MyRoutingDataSource();
        myRouteingDataSource.setDefaultTargetDataSource(masterDataSource);
        Map<Object,Object> targetDb = new HashMap<>();
        targetDb.put(DBType.MASTER,masterDataSource);
        targetDb.put(DBType.SLAVE,slaveDataSource);
        myRouteingDataSource.setTargetDataSources(targetDb);
        return myRouteingDataSource;
    }
}
