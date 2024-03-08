package com.mq.cl.os.topic;

/**
 * @author Surpass
 * @Package com.mq.cl
 * @Description: ${todo}
 * @date 2020/6/4 16:08
 */

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author SimpleWu
 * @Date 2019-05-17
 * 生产者
 */
@Component
public class TopicProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String routing){
        String sendMsg = "主题模式:" + routing + "   " + new Date();
        //指定队列
        this.rabbitTemplate.convertAndSend("topicExchange",routing,sendMsg);

    }
}