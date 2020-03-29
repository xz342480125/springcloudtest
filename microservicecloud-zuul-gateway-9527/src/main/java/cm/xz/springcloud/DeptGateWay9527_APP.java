package cm.xz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * springcloudtest
 * <p>
 * 网关
 *
 * @author Zhen Xu
 * @since 2020-03-29 12:21
 **/
@SpringBootApplication
@EnableZuulProxy
public class DeptGateWay9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptGateWay9527_APP.class, args);
    }
}
