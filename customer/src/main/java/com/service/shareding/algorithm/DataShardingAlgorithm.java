//package com.service.shareding.algorithm;
//
//import io.shardingsphere.api.algorithm.sharding.ListShardingValue;
//import io.shardingsphere.api.algorithm.sharding.ShardingValue;
//import io.shardingsphere.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;
//import lombok.extern.slf4j.Slf4j;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.LinkedHashSet;
//import java.util.List;
//

//@Slf4j
//public class DataShardingAlgorithm implements ComplexKeysShardingAlgorithm {
//
//    @Override
//    public Collection<String> doSharding(Collection<String> dataSources, Collection<ShardingValue> shardingValues) {
//        Collection<String> shardList = new LinkedHashSet<>();
//        List<String> dataSourcesList = new ArrayList<>(dataSources);
//        List<ShardingValue> shardingValueList =new ArrayList<>(shardingValues);
//        for (int i = 0;i<shardingValueList.size();i++){
//            ListShardingValue shardingValue = (ListShardingValue) shardingValueList.get(i);
//            List<Long> value = new ArrayList<>(shardingValue.getValues());
//            Long id = value.get(0);
//            for (String dataSoure:dataSourcesList){
//                if (dataSoure.endsWith(String.valueOf(id % 2))){
//                    shardList.add(dataSoure);
//                }
//            }
//        }
//        return  shardList;
//    }
//}
