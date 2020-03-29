package cm.xz.springcloud.controller;

import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * springcloudtest
 * <p>
 * 消费者控制层
 *
 * @author Zhen Xu
 * @since 2020-03-09 22:34
 **/
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    @Resource
    private DeptClientService deptClientService;

    @RequestMapping(value = "/add")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    @RequestMapping(value = "/asdf")
    public Object asdf() {
        return deptClientService.discovery();
    }


    public static void main(String[] args) {
        //以下程序两种结果
        int a = 0;
        a++;
        int b = 0;
        ++b;
        System.out.println(a);
        System.out.println(b);

//        int a = 0;
//        int b = 0;
//        System.out.println(a++);
//        System.out.println(++b);

    }
}
