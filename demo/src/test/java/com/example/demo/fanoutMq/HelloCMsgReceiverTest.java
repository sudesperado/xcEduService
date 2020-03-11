package com.example.demo.fanoutMq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloCMsgReceiverTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void helloMsgOne() throws Exception {
        helloSender.send();
    }

}