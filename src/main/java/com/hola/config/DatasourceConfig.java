package com.hola.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 
 * @author Dougest 2017年5月7日    下午6:11:52
 *
 */
@Configuration
public class DatasourceConfig {
	@Configuration
	public class DatasourceConfiguration {

	    @Bean(name = "dataSource")
	   // @Qualifier(value = "dataSource")  bean名字 
	   // @Primary 主库
	    @ConfigurationProperties(prefix = "c3p0")
	    public DataSource dataSource()
	    {
	        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	    }
	}
}
