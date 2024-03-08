package com.mq.cl.os.routing;

/**
 * @author Surpass
 * @Package com.mq.cl
 * @Description: ${todo}
 * @date 2020/6/4 16:06
 */

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author SimpleWu
 * @Date 2019-05-17
 * 该类初始化队列
 */
@Configuration
public class RoutingInitialization {

    //当没有这个队列的时候会自动创建
    @Bean
    Queue routingOne(){
        Queue queue = new Queue("queue.routing.one",true);
        return queue;
    }
    @Bean
    Queue routingTwo(){
        Queue queue = new Queue("queue.routing.two",true);
        return queue;
    }
    @Bean
    Queue routingThree(){
        Queue queue = new Queue("queue.routing.three",true);
        return queue;
    }

    //创建交换器
    @Bean
    DirectExchange routingExchange(){
        DirectExchange directExchange = new DirectExchange("routingExchange");
        return directExchange;
    }

    //绑定队列
    @Bean
    Binding bindingRoutingOne(Queue routingOne,DirectExchange routingExchange){
        Binding binding = BindingBuilder.bind(routingOne).to(routingExchange).with("1");
        return binding;
    }
    @Bean
    Binding bindingRoutingTwo(Queue routingTwo,DirectExchange routingExchange){
        Binding binding = BindingBuilder.bind(routingTwo).to(routingExchange).with("2");
        return binding;
    }
    @Bean
    Binding bindingRoutingThree(Queue routingThree,DirectExchange routingExchange){
        Binding binding = BindingBuilder.bind(routingThree).to(routingExchange).with("3");
        return binding;
    }
}