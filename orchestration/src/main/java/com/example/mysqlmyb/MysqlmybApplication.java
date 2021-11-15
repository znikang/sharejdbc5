package com.example.mysqlmyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlmybApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlmybApplication.class, args);
	}

//
//	@Bean
//	public PlatformTransactionManager txManager(final DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate(final DataSource dataSource) {
//		return new JdbcTemplate(dataSource);
//	}
}
