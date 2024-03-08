package com.mq.cl.os.routing;

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
@RequestMapping("/Routing")
public class RoutingController {

    @Autowired
    private RoutingProducer sayProducer;

    @RequestMapping("/routing/{name}")
    public String send(@PathVariable String name){
        sayProducer.send(name);
        return "发送成功";
    }
}
