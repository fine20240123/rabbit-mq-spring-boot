package com.mq.cl.os.PointToPoint;

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
@RequestMapping("/Point")
public class PointController {

    @Autowired
    private PointProducer sayProducer;

    @RequestMapping("/point/{name}")
    public String send(@PathVariable String name){
        sayProducer.send(name);
        return "发送成功";
    }

}
