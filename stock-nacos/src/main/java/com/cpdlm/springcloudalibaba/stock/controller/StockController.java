package com.cpdlm.springcloudalibaba.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 聊天控制器
 * @author tiankang
 * @version 1.0.0
 * @date 2020-09-21
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("库存扣减");
        return "success reduct";
    }

}
