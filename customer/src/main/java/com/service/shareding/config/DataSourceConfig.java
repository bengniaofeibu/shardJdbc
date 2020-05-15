package com.service.shareding.config;//package com.thz.shareding.config;
//
//import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
//import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSourceFactory;
//import com.dangdang.ddframe.rdb.sharding.api.rule.BindingTableRule;
//import com.dangdang.ddframe.rdb.sharding.api.rule.DataSourceRule;
//import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
//import com.dangdang.ddframe.rdb.sharding.api.rule.TableRule;
//import com.dangdang.ddframe.rdb.sharding.api.strategy.database.DatabaseShardingStrategy;
//import com.dangdang.ddframe.rdb.sharding.api.strategy.table.TableShardingStrategy;
//import com.dangdang.ddframe.rdb.sharding.keygen.DefaultKeyGenerator;
//import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
//import com.thz.shareding.algorithm.DataBaseShardingAlgorithm;
//import com.thz.shareding.algorithm.TableShardingAlgorithm;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.*;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Autowired
//    private DataBaseConfig0 dataBaseConfig0;
//
//    @Autowired
//    private DataBaseConfig1 dataBaseConfig1;
//
//    @Autowired
//    private DataBaseShardingAlgorithm dataBaseShardingAlgorithm;
//
//    @Autowired
//    private TableShardingAlgorithm tableShardingAlgorithm;
//
//
//    @Bean(name = "shardDataSource")
//    public DataSource createDataSource() throws SQLException {
//     return buildDataSource();
//    }
//
//    private DataSource buildDataSource() throws SQLException {
//        Map<String,DataSource> dataSourceMap = new HashMap<>(2);
//        dataSourceMap.put(dataBaseConfig0.getDataBaseName(),dataBaseConfig0.dataSource0());
//        dataSourceMap.put(dataBaseConfig1.getDataBaseName(),dataBaseConfig1.dataSource1());
//
//        DataSourceRule dataSourceRule = new DataSourceRule(dataSourceMap,dataBaseConfig0.getDataBaseName());
//
//        //分表设置，大致思想就是将查询虚拟表good根据一定规则映射到真实表中去
//        TableRule tableRule  = TableRule.builder("t_goods")
//                .actualTables(Arrays.asList("t_goods_0","t_goods_1"))
//                .dataSourceRule(dataSourceRule)
//                .build();
//
//        List<BindingTableRule> bindingTableRuleList = new ArrayList<>();
//        bindingTableRuleList.add(new BindingTableRule(Arrays.asList(tableRule)));
//        //分库分表策略
//        ShardingRule shardingRule = ShardingRule.builder()
//                .tableRules(Arrays.asList(tableRule))
//                .dataSourceRule(dataSourceRule)
//                .bindingTableRules(bindingTableRuleList)
//                .tableShardingStrategy(new TableShardingStrategy("goods_id",tableShardingAlgorithm))
//                .databaseShardingStrategy(new DatabaseShardingStrategy("goods_type",dataBaseShardingAlgorithm))
//                .build();
//
//        return ShardingDataSourceFactory.createDataSource(shardingRule);
//    }
//
//
//    @Bean
//    public MybatisSqlSessionFactoryBean sqlSessionFactory(@Qualifier("shardDataSource") DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        sessionFactoryBean
//                .setTypeAliasesPackage("com.thz.shareding.dto");
//        sessionFactoryBean
//                .setMapperLocations(new PathMatchingResourcePatternResolver()
//                        .getResources("classpath:mappers/*.xml"));
//        return sessionFactoryBean;
//    }
//
//    @Bean
//    public KeyGenerator keyGenerator() {
//        return new DefaultKeyGenerator();
//    }
//}
