package cm.xz.springcloud.service.impl;

import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.DeptClientService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * springcloudtest
 * <p>
 * DeptService
 *
 * @author Zhen Xu
 * @since 2020-03-26 22:58
 **/
@Service
public class DeptClientServiceImpl implements DeptClientService {
    @Override
    public boolean add(Dept dept) {
        return false;
    }

    @Override
    public Dept get(Long id) {
        return new Dept().setDepteno(id)
                .setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @Override
    public List<Dept> list() {
        return null;
    }

    @Override
    public Object discovery() {
        return null;
    }
}
