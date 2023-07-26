package com.yupi.springbootinit.manager;

import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.ThrowUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author lwx
 * @since 2023/7/4 12:06
 */
@SpringBootTest
class AIManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void test() {
        long modelId = 1676070132889235458L;
        String message = "分析需求：\n" +
                "分析网站用户的增长情况\n" +
                "原始数据：\n" +
                "日期,用户数\n" +
                "1号,10\n" +
                "2号,20\n" +
                "3号,30";
        String res = aiManager.doChat(modelId, message);
        final String str = "=>=>=>";
        String[] aiRes = res.split(str);
        System.out.println(aiRes.length);
        ThrowUtils.throwIf(aiRes.length < 3, ErrorCode.SYSTEM_ERROR, "AI返回结果有误");
        String genChart = aiRes[ 1 ].trim();
        String genRes = aiRes[ 2 ].trim();
        System.out.println(genChart);
        System.out.println(genRes);
    }
}