package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by SqMax on 2018/3/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name="imooc";
        String password="123456";
        //要安裝Lombok插件，才能直接用log
        log.debug("debug......");
        log.info("name: {} , password: {}",name,password);
        log.error("error......");
        log.warn("warning.....");

    }
}
