package cm.xz.springcloud.controller;

import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private DeptService service = null;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") long id) {
        Dept dept = this.service.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") long id) {
        return new Dept().setDepteno((int)id)
                .setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }


    public static void main(String[] args) {
        List list = new ArrayList(10);
        System.out.println(list.size());
    }
}
