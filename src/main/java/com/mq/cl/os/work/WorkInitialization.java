package com.mq.cl.os.work;

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
public class WorkInitialization {

    //当没有这个队列的时候会自动创建
    @Bean
    Queue work(){
        Queue queue = new Queue("WorkingMode",true);
        return queue;
    }
}