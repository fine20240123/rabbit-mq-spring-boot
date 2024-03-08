package com.mq.cl.os.topic;

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
public class TopicInitialization {

    //当没有这个队列的时候会自动创建
    @Bean
    Queue topicOne(){
        Queue queue = new Queue("queue.topic.one",true);
        return queue;
    }
    @Bean
    Queue topicTwo(){
        Queue queue = new Queue("queue.topic.two",true);
        return queue;
    }
    @Bean
    Queue topicThree(){
        Queue queue = new Queue("queue.topic.three",true);
        return queue;
    }

    //创建交换器
    @Bean
    TopicExchange topicExchange(){
        TopicExchange directExchange = new TopicExchange("topicExchange");
        return directExchange;
    }

    //绑定队列
    @Bean
    Binding bindingTopicOne(Queue topicOne,TopicExchange topicExchange){
        Binding binding = BindingBuilder.bind(topicOne).to(topicExchange).with("#.error");
        return binding;
    }
    @Bean
    Binding bindingTopicTwo(Queue topicTwo,TopicExchange topicExchange){
        Binding binding = BindingBuilder.bind(topicTwo).to(topicExchange).with("#.log");
        return binding;
    }
    @Bean
    Binding bindingTopicThree(Queue topicThree,TopicExchange topicExchange){
        Binding binding = BindingBuilder.bind(topicThree).to(topicExchange).with("good.#.timer");
        return binding;
    }
}