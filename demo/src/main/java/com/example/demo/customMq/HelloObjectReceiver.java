package com.example.demo.customMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloOneToOne-Object")
public class HelloObjectReceiver {
    @RabbitHandler
    public void proceed(String str){
        System.out.println("-->HelloObjectReceiver Println: " + str);
    }
}
