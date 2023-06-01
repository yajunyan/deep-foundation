package com.yloonspring.accservers;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.PostConstruct;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年8月24日 下午9:40:47
 * @ClassName AccserversApplication
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
@EnableDubbo()
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@NacosPropertySource(dataId = "accserver", autoRefreshed = true)
public class AccserversApplication {

	@Value("${spring.application.name}")
	private String applicationName;

	@NacosInjected
	private NamingService namingService;

	public static void main(String[] args) {
		SpringApplication.run(AccserversApplication.class, args);
		System.out.println("AccserversApplication running...");
	}

	@PostConstruct
	public void registerService() throws NacosException{
		namingService.registerInstance(applicationName, "127.0.0.1", 8099);
	}

}
