package com.mq.cl.os.PointToPoint;

/**
 * @author Surpass
 * @Package com.mq.cl
 * @Description: ${todo}
 * @date 2020/6/4 16:06
 */

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author SimpleWu
 * @Date 2019-05-17
 * 该类初始化队列
 */
@Configuration
public class PointInitialization {

    @Bean
    Queue toPoint(){
        Queue queue = new Queue("point.to.point",true);
        return queue;
    }
}