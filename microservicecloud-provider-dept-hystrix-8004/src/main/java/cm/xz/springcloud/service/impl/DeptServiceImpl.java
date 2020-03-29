package cm.xz.springcloud.service.impl;

import cm.xz.springcloud.dao.DeptDao;
import cm.xz.springcloud.entity.Dept;
import cm.xz.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * springcloudtest
 * <p>
 * DeptImpl
 *
 * @author Zhen Xu
 * @since 2020-03-08 23:00
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
