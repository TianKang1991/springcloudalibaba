package com.cpdlm.springcloudalibaba.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单控制器
 * @author tiankang
 * @version 1.0.0
 * @date 2020-09-21
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://localhost:8011/stock/reduct", String.class);
        return " success order "+msg;
    }

}
