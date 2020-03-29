package cm.xz.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * springcloudtest
 * <p>
 * 配置Bean
 *
 * @author Zhen Xu
 * @since 2020-03-09 22:07
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**此处只是更改勒了Ribbon的默认负载均衡方案,而且使用的是其API中的算法
     * 若想自定义负载均衡算法，还需要另外的操作，具体请见视频*/
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
