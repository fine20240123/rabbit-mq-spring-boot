package com.mq.cl.os.PointToPoint;

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
public class PointConsumer {


    @RabbitListener(queues = "point.to.point")
    public void processOne(String name) {
        System.out.println("point.to.point：" + name);
    }

}