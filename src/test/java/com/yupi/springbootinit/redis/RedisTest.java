package com.yupi.springbootinit.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * @author lwx
 * @since 2023/7/26 15:34
 */
@SpringBootTest
class RedisTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void test() {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        String key = "user-register-count";
        Long increment = operations.increment(key, 1);
        System.out.println(increment);
    }
}