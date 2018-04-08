package com.rich.Listener;

import com.rich.services.ITestService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.listener.MessageListener;

import java.util.Map;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/3/19 15:36
 */
public class CustomerListener implements MessageListener<String, String> {

    private Map<String,ITestService> operateProcessorMap;

    public Map<String, ITestService> getOperateProcessorMap() {
        return operateProcessorMap;
    }

    public void setOperateProcessorMap(Map<String, ITestService> operateProcessorMap) {
        this.operateProcessorMap = operateProcessorMap;
    }

    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
        ITestService testService=  operateProcessorMap.get("testService");
        testService.method();
        System.out.println("KafkaConsumerServer=============kafkaConsumer start=============");
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();
        System.out.println("KafkaConsumerServer-------------topic:" + topic);
        System.out.println("KafkaConsumerServer-------------value:" + value);
        System.out.println("KafkaConsumerServer-------------key:" + key);
        System.out.println("KafkaConsumerServer-------------offset:" + offset);
        System.out.println("KafkaConsumerServer-------------partition:" + partition);
        System.out.println("~~~~~~~~~~~~~kafkaConsumer end~~~~~~~~~~~~~");
        System.out.println("success***************************************************************");
    }
}
