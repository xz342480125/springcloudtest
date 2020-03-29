package cm.xz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * springcloudtest
 * <p>
 * 主启动类
 *
 * @author Zhen Xu
 * @since 2020-03-09 23:00
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "cm.xz.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
