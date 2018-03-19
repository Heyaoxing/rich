package com.rich.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.io.Console;
import java.util.Date;
//
//public class MyElasticJob implements SimpleJob {
//
//    @Override
//    public void execute(ShardingContext shardingContext) {
//            System.out.println(String.format("------Thread ID: %s, TotalCount: %s, ShardingItem: %s",
//                    Thread.currentThread().getId(), shardingContext.getShardingTotalCount(), shardingContext.getShardingItem()));
//    }
//}