package vip.gameclub.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import vip.gameclub.springcloud.entities.CommonResult;
import vip.gameclub.springcloud.entities.Payment;
import vip.gameclub.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/5 12:55
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果,id:{}",result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功,serverPort:"+serverPort, result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort:"+serverPort, payment);
        }
        return new CommonResult(444, "查询失败", null);
    }
}
