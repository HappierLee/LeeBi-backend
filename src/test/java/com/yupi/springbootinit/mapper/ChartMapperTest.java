package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.base.SqlEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author lwx
 * @since 2023/7/5 15:41
 */
@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;

    @Test
    void creatChartTable() {
        List<SqlEntity> list = new ArrayList<>();
        SqlEntity sqlEntity = new SqlEntity();
        sqlEntity.setColumnName("日期");
        sqlEntity.setColumnType("int");
        SqlEntity sqlEntity1 = new SqlEntity();
        sqlEntity1.setColumnName("人数");
        sqlEntity1.setColumnType("int");
        list.add(sqlEntity);
        list.add(sqlEntity1);
        boolean b = chartMapper.creatChartTable(123124L, list);

    }

    @Test
    void insertBatchChart() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Map<String, Object> hashMap = new HashMap<>(10);
            hashMap.put("日期", i);
            hashMap.put("人数", i);
            listMap.add(hashMap);
        }

//        Map<String, Map<String, Object>> map = new HashMap<>();
//        for (int i = 1; i <= 5; i++) {
//            Map<String, Object> hashMap = new HashMap<>();
//            hashMap.put("日期", i);
//            hashMap.put("人数", i);
//            map.put("日期", hashMap);
//            map.put("人数", hashMap);
//        }

        chartMapper.insertBatchChart(123124L, Arrays.asList("日期", "人数"), listMap);
    }
}