package com.example.demo.customMq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectRabbitMQConfig {
    @Bean
    public Queue queueString(){
        return new Queue("helloOneToOne-String");
    }

    @Bean
    public Queue queueObject(){
        return new Queue("helloOneToOne-Object");
    }
}
