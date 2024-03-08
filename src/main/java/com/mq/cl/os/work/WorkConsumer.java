package com.mq.cl.os.work;

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
public class WorkConsumer {


    @RabbitListener(queues = "WorkingMode")
    public void processOne(String name) {
        System.out.println("WorkingMode1：" + name);
    }

    @RabbitListener(queues = "WorkingMode")
    public void processTwo(String name) {
        System.out.println("WorkingMode2：" + name);
    }

    @RabbitListener(queues = "WorkingMode")
    public void processThree(String name) {
        System.out.println("WorkingMode3：" + name);
    }

}