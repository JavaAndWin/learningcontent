package com.example.testmq.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic",groupId = "my-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("收到消息：" + record.value());
    }
}
