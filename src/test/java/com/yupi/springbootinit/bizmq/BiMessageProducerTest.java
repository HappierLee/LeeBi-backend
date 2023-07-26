package com.yupi.springbootinit.bizmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author lwx
 * @since 2023/7/11 10:26
 */
@SpringBootTest
class BiMessageProducerTest {

    @Resource
    private BiMessageProducer biMessageProducer;

    @Test
    void sendMessage() {
        biMessageProducer.sendMessage("test");
    }
}