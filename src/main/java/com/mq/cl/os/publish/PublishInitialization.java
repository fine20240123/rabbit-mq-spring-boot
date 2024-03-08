package com.mq.cl.os.publish;

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
public class PublishInitialization {

    //当没有这个队列的时候会自动创建
    @Bean
    Queue publishOne(){
        Queue queue = new Queue("queue.publish.one",true);
        return queue;
    }
    @Bean
    Queue publishTwo(){
        Queue queue = new Queue("queue.publish.two",true);
        return queue;
    }
    @Bean
    Queue publishThree(){
        Queue queue = new Queue("queue.publish.three",true);
        return queue;
    }

    //创建交换器
    @Bean
    FanoutExchange pulishExchange(){
        FanoutExchange directExchange = new FanoutExchange("publishExchange");
        return directExchange;
    }

    //绑定队列
    @Bean
    Binding bindingPublishOne(Queue publishOne,FanoutExchange pulishExchange){
        Binding binding = BindingBuilder.bind(publishOne).to(pulishExchange);
        return binding;
    }
    @Bean
    Binding bindingPublishTwo(Queue publishTwo,FanoutExchange pulishExchange){
        Binding binding = BindingBuilder.bind(publishTwo).to(pulishExchange);
        return binding;
    }
    @Bean
    Binding bindingPublishThree(Queue publishThree,FanoutExchange pulishExchange){
        Binding binding = BindingBuilder.bind(publishThree).to(pulishExchange);
        return binding;
    }
}