package com.example.demo.customMq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectHelloTest {

    @Autowired
    private HelloSender helloSender;

    // 测试
    @Test
    public void hello() throws Exception {
        // 发送String消息
        helloSender.sendString();
        // 发送Object消息
        helloSender.sendObject();
    }

}