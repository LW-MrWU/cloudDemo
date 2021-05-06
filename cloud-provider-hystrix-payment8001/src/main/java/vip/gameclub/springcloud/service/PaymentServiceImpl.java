package vip.gameclub.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/5/6 12:30
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    public String paymentInfo_OK(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_OK, id: "+id+"\t"+"haha";
    }

    public String paymentInfo_TimeOut(Integer id){
        int timeNum = 3;;
        try{
            TimeUnit.SECONDS.sleep(timeNum);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_TimeOut, id: "+id+"\t"+"haha"+"耗时"+timeNum+"秒钟";
    }
}
