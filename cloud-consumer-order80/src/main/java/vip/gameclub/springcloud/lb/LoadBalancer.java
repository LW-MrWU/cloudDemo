package vip.gameclub.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/23 12:32
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
