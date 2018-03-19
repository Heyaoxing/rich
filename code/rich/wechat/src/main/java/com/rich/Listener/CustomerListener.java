package com.rich.Listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/3/19 15:36
 */
public class CustomerListener implements MessageListener<String, String> {

    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
       System.out.println("KafkaConsumerServer=============kafkaConsumer start=============");
        String topic = record.topic();
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();
       System.out.println("KafkaConsumerServer-------------topic:"+topic);
       System.out.println("KafkaConsumerServer-------------value:"+value);
       System.out.println("KafkaConsumerServer-------------key:"+key);
       System.out.println("KafkaConsumerServer-------------offset:"+offset);
       System.out.println("KafkaConsumerServer-------------partition:"+partition);
       System.out.println("~~~~~~~~~~~~~kafkaConsumer end~~~~~~~~~~~~~");
       System.out.println("success***************************************************************");
    }
}
