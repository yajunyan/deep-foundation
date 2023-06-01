/* Copyright (c) 2018, umfintech software
 * @description: 数据源配置实体类
 * @author: luxin
 * @date:   2018-12-03
 * @version 1.0
 */
package com.yloonspring.accservers.datasource.data;


public class HikariDataSourceData {
	private String jdbcUrlQuote;
	private String driverClassName;
	private String username;
	private String datasourceClass;
	private String connectionTestQuery;
	private int maximumPoolSize;
	private int idleTimeout;
	private String password;
	private boolean readOnly;
	private int connectionTimeout;
	private int maxLifetime;
	private boolean extra;

	private String jdbcUrl;
	private String delayTime;
	private String state;

	public String getJdbcUrlQuote() {
		return jdbcUrlQuote;
	}

	public void setJdbcUrlQuote(String jdbcUrlQuote) {
		this.jdbcUrlQuote = jdbcUrlQuote;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDatasourceClass() {
		return datasourceClass;
	}

	public void setDatasourceClass(String datasourceClass) {
		this.datasourceClass = datasourceClass;
	}

	public String getConnectionTestQuery() {
		return connectionTestQuery;
	}

	public void setConnectionTestQuery(String connectionTestQuery) {
		this.connectionTestQuery = connectionTestQuery;
	}

	public int getMaximumPoolSize() {
		return maximumPoolSize;
	}

	public void setMaximumPoolSize(int maximumPoolSize) {
		this.maximumPoolSize = maximumPoolSize;
	}

	public int getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(int idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public int getMaxLifetime() {
		return maxLifetime;
	}

	public void setMaxLifetime(int maxLifetime) {
		this.maxLifetime = maxLifetime;
	}

	public boolean getExtra() {
		return extra;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public void setExtra(boolean extra) {
		this.extra = extra;
	}

	public String getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
