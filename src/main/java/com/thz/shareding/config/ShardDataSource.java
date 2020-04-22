package com.thz.shareding.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import io.shardingjdbc.core.jdbc.core.datasource.ShardingDataSource;
import io.shardingjdbc.core.rule.ShardingRule;
import io.shardingjdbc.core.yaml.sharding.YamlShardingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Collections;

@Configuration
public class ShardDataSource {

    private static final String SHARD_CONFIG_PATH = "application-shard.yml";

    @Autowired
    private Filter statFilter;


    @Bean
    public DataSource dataSource() throws SQLException{
        YamlShardingConfiguration config = pase();
        ShardingRule rule = config.getShardingRule(Collections.emptyMap());
        rule.getDataSourceMap().forEach((k,v)->{
            DruidDataSource d = (DruidDataSource) v;
            d.setProxyFilters(Lists.newArrayList(statFilter));
        });
        return new ShardingDataSource(rule, config.getShardingRule().getConfigMap(), config.getShardingRule().getProps());
    }

    private YamlShardingConfiguration pase(){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(SHARD_CONFIG_PATH);
       return new Yaml(new Constructor(YamlShardingConfiguration.class)).loadAs(resourceAsStream,YamlShardingConfiguration.class);
    }
}
