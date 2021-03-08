package vip.gameclub.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import vip.gameclub.springcloud.entities.CommonResult;
import vip.gameclub.springcloud.entities.Payment;

import java.util.UUID;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/8 13:24
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String create(){
        return "springcloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
