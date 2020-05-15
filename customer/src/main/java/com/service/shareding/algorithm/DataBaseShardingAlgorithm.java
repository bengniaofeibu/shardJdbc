package com.service.shareding.algorithm;//package com.thz.shareding.algorithm;
//
//import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
//import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
//import com.google.common.collect.Lists;
//import com.google.common.collect.Range;
//import com.thz.shareding.config.DataBaseConfig0;
//import com.thz.shareding.config.DataBaseConfig1;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//import java.util.LinkedHashSet;
//
//@Component
//public class DataBaseShardingAlgorithm implements  SingleKeyDatabaseShardingAlgorithm<Long> {
//
//    @Autowired
//    private DataBaseConfig0 dataBaseConfig0;
//
//    @Autowired
//    private DataBaseConfig1 dataBaseConfig1;
//
//    @Override
//    public String doEqualSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        Long value = shardingValue.getValue();
//        return value <= 20L?dataBaseConfig0.getDataBaseName():dataBaseConfig1.getDataBaseName();
//    }
//
//    @Override
//    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        Collection<String> dataBaseList = new LinkedHashSet<>(shardingValue.getValues().size());
//        Collection<Long> values = shardingValue.getValues();
//        for (Long value:values){
//            dataBaseList.add(value <= 20L?dataBaseConfig0.getDataBaseName():dataBaseConfig1.getDataBaseName());
//        }
//        return dataBaseList;
//    }
//
//    @Override
//    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<Long> shardingValue) {
//        Collection<String> dataBaseList = new LinkedHashSet<>(collection.size());
//        Range<Long> valueRange = shardingValue.getValueRange();
//        for (Long value = valueRange.lowerEndpoint();value <= valueRange.upperEndpoint();value++){
//            dataBaseList.add(value <= 20L?dataBaseConfig0.getDataBaseName():dataBaseConfig1.getDataBaseName());
//        }
//        return dataBaseList;
//    }
//}
