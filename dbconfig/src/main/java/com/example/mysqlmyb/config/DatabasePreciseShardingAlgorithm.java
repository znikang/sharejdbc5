package com.example.mysqlmyb.config;

public class DatabasePreciseShardingAlgorithm
{
        //implements PreciseShardingAlgorithm<Long> {
//    @Override
//    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
//        //System.out.println("------------------select database name");
//        Long curValue = shardingValue.getValue();
//        String curBase = "";
//        if (curValue < 100) {
//            curBase = "saleorder01";
//        } else {
//            curBase = "saleorder02";
//        }
//        return curBase;
//    }
}
