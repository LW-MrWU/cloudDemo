package vip.gameclub.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/23 12:34
 */
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current>=Integer.MAX_VALUE?0:current+1;
        }while (!atomicInteger.compareAndSet(current,next));

        System.out.println("next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
