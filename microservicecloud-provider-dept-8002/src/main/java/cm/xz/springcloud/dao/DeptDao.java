package cm.xz.springcloud.dao;

import cm.xz.springcloud.entity.Dept;

import java.util.List;

/**
 * springcloudtest
 * <p>
 * DeptDao
 *
 * @author Zhen Xu
 * @since 2020-03-08 22:32
 **/
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
