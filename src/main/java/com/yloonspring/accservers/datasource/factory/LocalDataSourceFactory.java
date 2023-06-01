package com.yloonspring.accservers.datasource.factory;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.yloonspring.accservers.constant.DBConstant;
import com.yloonspring.accservers.datasource.condition.DataSourceQualifierCondition;
import com.yloonspring.accservers.datasource.data.HikariDataSourceData;
import com.yloonspring.accservers.datasource.dsannotation.DataSourceAnnotation;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2020/11/18 14:55
 * @ClassName: LocalDataSourceFactory
 * @类描述-Description: 根据yml文件配置设置datasourceCP数据
 * @修改记录:
 * @版本: 1.0
 */
@Configuration
@MapperScan(basePackages = { "com.yloonspring.accservers.mapper" })
public class LocalDataSourceFactory implements EnvironmentAware {
	@Autowired
	private ConfigurableEnvironment env;

	@Override
	public void setEnvironment(Environment environment) {

	}

	/* MasterDataSource,将datasource配置项目,默认主数据源 */
	@Bean
	@Primary
	@Conditional(value = DataSourceQualifierCondition.class)
	@DataSourceAnnotation(DBConstant.DS_MASTER)
	public DataSource masterDataSource(@Qualifier("masterDbFactory") HikariDataSourceData prop) {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(prop.getDriverClassName());
		hikariConfig.setJdbcUrl(prop.getJdbcUrl());
		hikariConfig.setUsername(prop.getUsername());
		hikariConfig.setPassword(prop.getPassword());
		hikariConfig.setMaximumPoolSize(prop.getMaximumPoolSize());
		hikariConfig.setMaxLifetime(prop.getMaxLifetime());
		hikariConfig.setIdleTimeout(prop.getIdleTimeout());
		hikariConfig.setConnectionTimeout(prop.getConnectionTimeout());
		hikariConfig.setConnectionTestQuery(prop.getConnectionTestQuery());

		return new HikariDataSource(hikariConfig);
	}

	/* SlaveDataSource,将datasource配置项目 */
	@Bean
	@Conditional(value = DataSourceQualifierCondition.class)
	@DataSourceAnnotation(DBConstant.DS_SLAVE)
	public DataSource slaveDataSource(@Qualifier("slaveDbFactory") HikariDataSourceData prop) {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(prop.getDriverClassName());
		hikariConfig.setJdbcUrl(prop.getJdbcUrl());
		hikariConfig.setUsername(prop.getUsername());
		hikariConfig.setPassword(prop.getPassword());
		hikariConfig.setMaximumPoolSize(prop.getMaximumPoolSize());
		hikariConfig.setMaxLifetime(prop.getMaxLifetime());
		hikariConfig.setIdleTimeout(prop.getIdleTimeout());
		hikariConfig.setConnectionTimeout(prop.getConnectionTimeout());
		hikariConfig.setConnectionTestQuery(prop.getConnectionTestQuery());

		return new HikariDataSource(hikariConfig);
	}

	/* jdbc sqlSessionfactory配置 */
	@Bean
	@Primary
	public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage(env.getProperty("mybatis.type-aliases-package"));
		sqlSessionFactoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapper-locations")));
		return sqlSessionFactoryBean.getObject();
	}

	/* 事务管理器配置 */
	@Bean
	@Primary
	public DataSourceTransactionManager transactionManager(@Qualifier("masterDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
