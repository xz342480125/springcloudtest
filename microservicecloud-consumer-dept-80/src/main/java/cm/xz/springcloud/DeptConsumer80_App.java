package cm.xz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
