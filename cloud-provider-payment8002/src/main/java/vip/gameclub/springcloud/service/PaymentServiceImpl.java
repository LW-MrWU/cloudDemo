package vip.gameclub.springcloud.service;

import org.springframework.stereotype.Service;
import vip.gameclub.springcloud.dao.PaymentDao;
import vip.gameclub.springcloud.entities.Payment;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/5 12:52
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
