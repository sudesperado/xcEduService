package com.example.demo.fanoutMq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutRabbitMQConfig {
    @Bean
    public Queue Amsg(){
        return new Queue("fanout.A");
    }

    @Bean
    public Queue Bmsg(){
        return new Queue("fanout.B");
    }

    @Bean
    public Queue Cmsg(){
        return new Queue("fanout.C");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeA(Queue Amsg , FanoutExchange fanoutExchange){
        return BindingBuilder.bind(Amsg).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue Bmsg , FanoutExchange fanoutExchange){
        return BindingBuilder.bind(Bmsg).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeC(Queue Cmsg , FanoutExchange fanoutExchange){
        return BindingBuilder.bind(Cmsg).to(fanoutExchange);
    }
}
