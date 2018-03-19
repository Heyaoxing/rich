package com.rich.Listener;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.ProducerListener;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/3/19 18:58
 */
public class KafkaProducerListener implements ProducerListener {
    @Override
    public void onSuccess(String topic, Integer partition, Object key, Object value, RecordMetadata recordMetadata) {
        System.out.println("==========kafka send success end ==========");
        System.out.println("----------topic:"+topic);
        System.out.println("----------partition:"+partition);
        System.out.println("----------key:"+key);
        System.out.println("----------value:"+value);
        System.out.println("----------RecordMetadata:"+recordMetadata);
        System.out.println("~~~~~~~~~~kafka send success end~~~~~~~~~~");
    }

    @Override
    public void onError(String topic, Integer partition, Object key, Object value, Exception exception) {
        System.out.println("==========kafka send error start==========");
        System.out.println("----------topic:"+topic);
        System.out.println("----------partition:"+partition);
        System.out.println("----------key:"+key);
        System.out.println("----------value:"+value);
        System.out.println("----------Exception:"+exception);
        System.out.println("~~~~~~~~~~kafka send error end~~~~~~~~~~");
        exception.printStackTrace();
    }

    @Override
    public boolean isInterestedInSuccess() {
        System.out.println("///kafkaProducer listener start///");
        return true;
    }
}
