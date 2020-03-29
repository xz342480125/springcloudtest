package cm.xz.springcloud.controller;

import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * springcloudtest
 * <p>
 * DeptController
 *
 * @author Zhen Xu
 * @since 2020-03-08 23:03
 **/
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping("/asdf")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("***************" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        srvList.forEach(serviceInstance -> {
            System.out.println(serviceInstance.getServiceId()
                    + "\t" + serviceInstance.getHost()
                    + "\t" + serviceInstance.getPort()
                    + "\t" + serviceInstance.getUri());
        });
        return this.client;
    }

    public static void main(String[] args) {
        List list = new ArrayList(10);
        System.out.println(list.size());
    }
}
