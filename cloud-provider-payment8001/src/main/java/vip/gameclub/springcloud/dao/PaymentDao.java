package vip.gameclub.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import vip.gameclub.springcloud.entities.Payment;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/5 12:36
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
