package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author lwx
 * @since 2023/7/5 22:46
 */
@SpringBootTest
class RedisLimiterManagerTest {

    @Resource
    private RedisLimiterManager redisLimiterManager;

    @Test
    void doRateLimit() {
        String key = "doRateLimit:1";
        for (int i = 0; i < 5; i++) {
            redisLimiterManager.doRateLimit(key);
            System.out.println("获取成功");
        }
    }
}