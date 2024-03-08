package com.mq.cl.os.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Surpass
 * @Package com.mq.cl
 * @Description: ${todo}
 * @date 2020/6/4 16:10
 */
@RestController
@RequestMapping("/Topic")
public class TopicController {

    @Autowired
    private TopicProducer sayProducer;

    @RequestMapping("/topic/{type}")
    public String send(@PathVariable String type){
        sayProducer.send(type);
        return "发送成功";
    }
}
