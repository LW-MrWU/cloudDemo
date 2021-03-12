package vip.gameclub.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/6 16:32
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //使用这个注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
