package cm.xz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * springcloudtest
 * <p>
 * Eureka主启动类
 *
 * @author Zhen Xu
 * @since 2020-03-10 14:41
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
