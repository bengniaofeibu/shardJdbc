//package com.thz.shareding.algorithm;
//
//import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
//import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
//import com.google.common.collect.Range;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//import java.util.LinkedHashSet;
//
//@Component
//public class TableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<Long> {
//
//
//    @Override
//    public String doEqualSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
//        for (String tableName:tableNames){
//            if (tableName.endsWith((shardingValue.getValue() % 2)+"")){
//                return tableName;
//            }
//        }
//        throw  new IllegalArgumentException();
//    }
//
//    @Override
//    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
//
//        Collection<String> tableList = new LinkedHashSet<>(tableNames.size());
//        for (Long value:shardingValue.getValues()){
//            for (String tableName:tableNames){
//                if (tableName.endsWith((value % 2)+"")){
//                    tableList.add(tableName);
//                }
//            }
//        }
//        return tableList;
//    }
//
//    @Override
//    public Collection<String> doBetweenSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
//        Collection<String> tableList = new LinkedHashSet<>(tableNames.size());
//        Range<Long> valueRange = shardingValue.getValueRange();
//        for (Long value = valueRange.lowerEndpoint();value <= valueRange.upperEndpoint();value++){
//            for (String tableName:tableNames){
//                if (tableName.endsWith((value % 2)+"")){
//                    tableList.add(tableName);
//                }
//            }
//        }
//        return tableList;
//    }
//}
