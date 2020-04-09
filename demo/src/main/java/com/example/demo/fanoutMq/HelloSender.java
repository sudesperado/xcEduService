package com.example.demo.fanoutMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fanoutSender")
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

//    private RabbitTemplate rabbitTemplate;

    public void send(){
        String str = "Hello Fanout Exchange Msgs!";

        this.amqpTemplate.convertAndSend("fanoutExchange", "", str);
//        this.rabbitTemplate.convertAndSend("fanoutExchange", "", str);
    }


}
