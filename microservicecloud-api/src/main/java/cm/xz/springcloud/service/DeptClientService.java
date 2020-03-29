package cm.xz.springcloud.service;

import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.impl.DeptClientServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * springcloudtest
 * <p>
 * Feign服务
 *
 * @author Zhen Xu
 * @since 2020-03-15 22:41
 **/
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallback = DeptClientServiceImpl.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping("/dept/asdf")
    Object discovery();
}
