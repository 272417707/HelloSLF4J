package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf {
    final Logger logger = LoggerFactory.getLogger(TestSlf.class);

    private void test() {
        logger.info("这是一条日志信息 - {}", "我是参数");
        logger.info("第一次更新");
    }

    public static void main(String[] args) {
        TestSlf testSlf = new TestSlf();
        testSlf.test();

        System.out.println("Hello World!");
    }
}
