package factory.produce;

import model.TableInfo;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 18:42
 * @Description:
 */
public interface IBuild {
    void build(List<TableInfo> tables);
}
