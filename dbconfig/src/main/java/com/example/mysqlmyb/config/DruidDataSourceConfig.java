package com.example.mysqlmyb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Description:
 * @author dingzhiwei jmdhappy@126.com
 * @date 2017-07-05
 * @version V1.0
 * @Copyright: www.xxpay.org
 */
@Configuration
@MapperScan(value = "com.example.mysqlmyb.mapper")
public class DruidDataSourceConfig implements EnvironmentAware {

    private Environment environment;

    @Value("${sharding.workerid:0}")
    private long workerId;

//    @Bean
//    public DataSource getShardingDataSource() throws SQLException {
//        if (workerId > 0) {
//         //   DefaultKeyGenerator.setWorkerId(workerId);
//           // log.info("设置sharding workid：{}", workerId);
//        }
//
//        Map<String, DataSource> dataSourceMap = new HashMap<>();
//
//        RegistryCenterConfiguration regConfig = new RegistryCenterConfiguration("zookeeper");
//        regConfig.setServerLists("127.0.0.1:2181");
//        regConfig.setNamespace("sharding-sphere-orchestration");
//
//        OrchestrationConfiguration orchConfig =
//                new OrchestrationConfiguration("orchestration-sharding-data-source", regConfig, false);
//
//        DataSource dataSource = OrchestrationShardingDataSourceFactory.createDataSource(orchConfig);
//
//
//        return dataSource;
//    }



    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

//    //注册dataSource
//    @Bean(initMethod = "init", destroyMethod = "close")
//    public DruidDataSource dataSource() throws SQLException {
//        if (StringUtils.isEmpty(environment.getProperty("spring.datasource.url"))) {
//
//            throw new ApplicationContextException(
//                    "Database connection pool is not configured correctly");
//        }
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
//        druidDataSource.setUrl(environment.getProperty("spring.datasource.url"));
//        druidDataSource.setUsername(environment.getProperty("spring.datasource.username"));
//        druidDataSource.setPassword(environment.getProperty("spring.datasource.password"));
//        druidDataSource.setInitialSize(Integer.parseInt(environment.getProperty("spring.datasource.initialSize")));
//        druidDataSource.setMinIdle(Integer.parseInt(environment.getProperty("spring.datasource.minIdle")));
//        druidDataSource.setMaxActive(Integer.parseInt(environment.getProperty("spring.datasource.maxActive")));
//        druidDataSource.setMaxWait(Integer.parseInt(environment.getProperty("spring.datasource.maxWait")));
//        druidDataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(environment.getProperty("spring.datasource.timeBetweenEvictionRunsMillis")));
//        druidDataSource.setMinEvictableIdleTimeMillis(Long.parseLong(environment.getProperty("spring.datasource.minEvictableIdleTimeMillis")));
//        druidDataSource.setValidationQuery(environment.getProperty("spring.datasource.validationQuery"));
//        druidDataSource.setTestWhileIdle(Boolean.parseBoolean(environment.getProperty("spring.datasource.testWhileIdle")));
//        druidDataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getProperty("spring.datasource.testOnBorrow")));
//        druidDataSource.setTestOnReturn(Boolean.parseBoolean(environment.getProperty("spring.datasource.testOnReturn")));
//        druidDataSource.setPoolPreparedStatements(Boolean.parseBoolean(environment.getProperty("spring.datasource.poolPreparedStatements")));
//        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(Integer.parseInt(environment.getProperty("spring.datasource.maxPoolPreparedStatementPerConnectionSize")));
//        druidDataSource.setFilters(environment.getProperty("spring.datasource.filters"));
//        return druidDataSource;
//    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/example/mysqlmyb/mapper/*.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() throws SQLException {
//        return new DataSourceTransactionManager(dataSource());
//    }
}
