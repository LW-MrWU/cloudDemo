package vip.gameclub.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vip.gameclub.springcloud.entities.CommonResult;
import vip.gameclub.springcloud.entities.Payment;
import vip.gameclub.springcloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/23 13:21
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentBId(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {

        return paymentFeignService.paymentFeignTimeout();
    }
}