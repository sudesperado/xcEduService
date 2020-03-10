package com.example.demo.customMq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloObjectReceiverTest {

    @Autowired
    private HelloObjectReceiver helloObjectReceiver;

    @Test
    public void hellow(){
        helloObjectReceiver.proceed("你好");
    }
}