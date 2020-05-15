package com.service.shareding.config;//package com.thz.shareding.config;
//
//import com.alibaba.druid.filter.Filter;
//import com.alibaba.druid.filter.stat.StatFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class DruidConfig {
//
//
//    @Bean(name = "filter")
//    public Filter statFilter(){
//        StatFilter filter = new StatFilter();
//        filter.setSlowSqlMillis(5000);
//        filter.setLogSlowSql(true);
//        filter.setMergeSql(true);
//        return filter;
//    }
//}
