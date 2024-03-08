package com.mq.cl.os.routing;

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
public class RoutingProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String type){
        String sendMsg = "路由模式:" + type + "   " + new Date();
        //指定队列
        if (type.equals("1")){
            this.rabbitTemplate.convertAndSend("routingExchange","1",sendMsg);
        }
        if (type.equals("2")){
            this.rabbitTemplate.convertAndSend("routingExchange","2",sendMsg);
        }
        if (type.equals("3")){
            this.rabbitTemplate.convertAndSend("routingExchange","3",sendMsg);
        }
    }
}