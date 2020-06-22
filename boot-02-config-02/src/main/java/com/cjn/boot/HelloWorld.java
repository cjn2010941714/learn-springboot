package com.cjn.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sky
 * @date 2020/6/6 0006 21:39
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("hello world");
    }
}
