package com.example.demo.customMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloOneToOne-String")
public class HelloStringReceiver {
    @RabbitHandler
    public void process(String str) {
        System.out.println("-->HelloStringReceiver Println: " + str);
    }


}
