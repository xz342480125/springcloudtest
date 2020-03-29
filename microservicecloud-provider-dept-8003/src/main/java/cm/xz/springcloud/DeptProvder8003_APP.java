package cm.xz.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@MapperScan("cm.xz.springcloud.dao")
public class DeptProvder8003_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvder8003_APP.class, args);
    }
}
