package com.yloonspring.accservers.datasource.factory;

import com.yloonspring.accservers.constant.DBConstant;
import com.yloonspring.accservers.datasource.condition.DataSourceQualifierCondition;
import com.yloonspring.accservers.datasource.data.HikariDataSourceData;
import com.yloonspring.accservers.datasource.dsannotation.DataSourceAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年11月09日 下午4:37:40
 * @ClassName DataSourceCondition
 * @类描述-Description: 根据yml文件配置判断是否装配本地数据源或者远程数据源配置项
 * 本期不做远程数据源配置，只做本地数据源
 * @修改记录:
 * @版本:
 */

@Configuration
@ConditionalOnProperty(value= DBConstant.DS_YML_INITWAY_KEY, havingValue = DBConstant.DS_STRATEGY_LOCAL)
@PropertySource(value="classpath:jdbc.properties")
public class LocalDataSourceProperFactory {

    @Autowired
    Environment env;

    @Bean
    @Primary
    @Conditional(DataSourceQualifierCondition.class)
    @DataSourceAnnotation(DBConstant.DS_MASTER)
    HikariDataSourceData masterDbFactory(){
        HikariDataSourceData masterProperty = new HikariDataSourceData();
        masterProperty.setDatasourceClass(env.getProperty("db.master.datasourceClass"));
        masterProperty.setUsername(env.getProperty("db.master.username"));
        masterProperty.setReadOnly(Boolean.valueOf(env.getProperty("db.master.readOnly")));
        masterProperty.setMaxLifetime(Integer.valueOf(env.getProperty("db.master.maxLifetime")));
        masterProperty.setPassword(env.getProperty("db.master.password"));
        masterProperty.setIdleTimeout(Integer.valueOf(env.getProperty("db.master.idleTimeout")));
        masterProperty.setDriverClassName(env.getProperty("db.master.driverClassName"));
        masterProperty.setMaximumPoolSize(Integer.valueOf(env.getProperty("db.master.maximumPoolSize")));
        masterProperty.setConnectionTimeout(Integer.valueOf(env.getProperty("db.master.connectionTimeout")));
        masterProperty.setDelayTime(env.getProperty("db.master.delayTime"));
        masterProperty.setJdbcUrl(env.getProperty("db.master.jdbcUrl"));
        masterProperty.setState(env.getProperty("db.master.state"));
        return masterProperty;
    }

    @Bean
    @Conditional(DataSourceQualifierCondition.class)
    @ConditionalOnProperty(DBConstant.DS_SLAVE)
    public HikariDataSourceData slaveDbFactory(){
        HikariDataSourceData slaveProperty = new HikariDataSourceData();
        slaveProperty.setDatasourceClass(env.getProperty("db.slave.datasourceClass"));
        slaveProperty.setUsername(env.getProperty("db.slave.username"));
        slaveProperty.setReadOnly(Boolean.valueOf(env.getProperty("db.slave.readOnly")));
        slaveProperty.setMaxLifetime(Integer.valueOf(env.getProperty("db.slave.maxLifetime")));
        slaveProperty.setPassword(env.getProperty("db.slave.password"));
        slaveProperty.setIdleTimeout(Integer.valueOf(env.getProperty("db.slave.idleTimeout")));
        slaveProperty.setDriverClassName(env.getProperty("db.slave.driverClassName"));
        slaveProperty.setMaximumPoolSize(Integer.valueOf(env.getProperty("db.slave.maximumPoolSize")));
        slaveProperty.setConnectionTimeout(Integer.valueOf(env.getProperty("db.slave.connectionTimeout")));
        slaveProperty.setDelayTime(env.getProperty("db.slave.delayTime"));
        slaveProperty.setJdbcUrl(env.getProperty("db.slave.jdbcUrl"));
        slaveProperty.setState(env.getProperty("db.slave.state"));

        return slaveProperty;
    }

}
