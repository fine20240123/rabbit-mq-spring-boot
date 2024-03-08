package com.mq.cl.os.routing;

/**
 * @author Surpass
 * @Package com.mq.cl
 * @Description: ${todo}
 * @date 2020/6/4 16:09
 */

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author SimpleWu
 * @Date 2019-05-17
 * 消费者
 * queues 指定监听的队列
 */

@Component
public class RoutingConsumer {


    @RabbitListener(queues = "queue.routing.one")
    public void processOne(String name) {
        System.out.println("queue.routing.one：" + name);
    }

    @RabbitListener(queues = "queue.routing.two")
    public void processTwo(String name) {
        System.out.println("queue.routing.two：" + name);
    }

    @RabbitListener(queues = "queue.routing.three")
    public void processThree(String name) {
        System.out.println("queue.routing.three：" + name);
    }

}