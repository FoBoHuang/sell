package com.imooc;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

/**
 * @author Huangfobo
 * @create 2018-07-23 9:37
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
//@Data
public class LoggerTest {

    @Test
    public void testA() {

        String name = "Huang";
        String password = "18875987906";

        log.debug("debug...");
        log.info("name: {},password: {}",name,password);
        log.error("error...");
        log.warn("warn...");
    }

}
