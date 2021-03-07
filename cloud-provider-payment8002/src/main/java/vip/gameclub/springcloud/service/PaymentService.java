package vip.gameclub.springcloud.service;

import vip.gameclub.springcloud.entities.Payment;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/5 12:51
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
