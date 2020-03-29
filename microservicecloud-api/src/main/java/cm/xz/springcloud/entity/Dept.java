package cm.xz.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * springcloudtest
 * <p>
 * Depte实体类
 *
 * @author Zhen Xu
 * @since 2020-03-08 22:34
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private long depteno;
    private String dname;
    private String db_source;
}
