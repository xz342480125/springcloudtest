package cm.xz.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * springcloudtest
 * <p>
 * 主启动类
 *
 * @author Zhen Xu
 * @since 2020-03-08 22:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("cm.xz.springcloud.dao")
public class DeptProvder8004_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvder8004_APP.class, args);
    }
}
