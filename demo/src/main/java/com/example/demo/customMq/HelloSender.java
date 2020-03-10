package com.example.demo.customMq;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component(value="directSender")
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendString() {
        String str = "Hello String![" +new Date() + "]";

        this.amqpTemplate.convertAndSend("helloOneToOne-String", str);
    }

    // 往Object队列发送消息
    public void sendObject() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("one", "oneValue");
        map.put("two", 2222);
        map.put("three", 9999.99);

        this.amqpTemplate.convertAndSend("helloOneToOne-Object", map);
    }

}
