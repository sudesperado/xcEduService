package com.example.demo.fanoutMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.B")
public class HelloBMsgReceiver {

    @RabbitHandler
    public void proceed(String str){
        System.out.println("-->HelloBMsgReceiver BBBB Println: " + str);
    }
}
