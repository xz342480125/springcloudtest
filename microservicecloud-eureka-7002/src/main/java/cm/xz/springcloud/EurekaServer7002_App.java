package cm.xz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * springcloudtest
 * <p>
 * eureka7002主启动类
 *
 * @author Zhen Xu
 * @since 2020-03-11 17:15
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
