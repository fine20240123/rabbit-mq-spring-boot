package com.mq.cl.os.publish;

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
public class PublishConsumer {


    @RabbitListener(queues = "queue.publish.one")
    public void processOne(String name) {
        System.out.println("queue.publish.one：" + name);
    }

    @RabbitListener(queues = "queue.publish.two")
    public void processTwo(String name) {
        System.out.println("queue.publish.two：" + name);
    }

    @RabbitListener(queues = "queue.publish.three")
    public void processThree(String name) {
        System.out.println("queue.publish.three：" + name);
    }

}