package cm.xz.springcloud.service;

import cm.xz.springcloud.entity.Dept;

import java.util.List;

/**
 * springcloudtest
 * <p>
 * DeptService
 *
 * @author Zhen Xu
 * @since 2020-03-08 22:31
 **/
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

}
