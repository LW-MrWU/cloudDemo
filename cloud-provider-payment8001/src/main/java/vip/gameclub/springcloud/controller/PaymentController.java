package vip.gameclub.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果,id:{}",result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功", result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查找结果1,id:{}",id);
        if(payment != null){
            return new CommonResult(200,"查询成功", payment);
        }
        return new CommonResult(444, "查询失败", null);
    }
}
