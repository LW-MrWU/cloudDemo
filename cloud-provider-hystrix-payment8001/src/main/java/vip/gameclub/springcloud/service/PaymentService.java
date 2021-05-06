package vip.gameclub.springcloud.service;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/5/6 12:29
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
}
