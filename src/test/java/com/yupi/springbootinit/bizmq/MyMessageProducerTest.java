package com.yupi.springbootinit.bizmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author lwx
 * @since 2023/7/9 16:04
 */
@SpringBootTest
class MyMessageProducerTest {

    @Resource
    private MyMessageProducer producer;

    @Test
    void sendMessage() {
        producer.sendMessage("test_exchange", "test_routing_key", "test");
    }
}