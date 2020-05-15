package com.service.shareding.config;//package com.thz.shareding.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
//import lombok.Data;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//
//@Component
//@ConfigurationProperties(prefix = "spring.datasource1")
//@Data
//public class DataBaseConfig1 {
//
//    private String url;
//    private String userName;
//    private String password;
//    private String driverClassName;
//    private String dataBaseName;
//
//    @Bean(name = "dataSource1")
//    public DataSource dataSource1(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(userName);
//        dataSource.setPassword(password);
//        dataSource.setDriverClassName(driverClassName);
//        return dataSource;
//    }
//
//}
