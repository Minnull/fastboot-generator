package factory.data;/**
 * Created by zhangqin on 2017/5/12.
 */


import model.TableInfo;

import java.util.List;

/**
 * 获取表结构
 *
 * @author
 * @create 2017-05-12 9:17
 **/
public interface GetDatabaseInfoFactory {

    List<TableInfo> getTable();
}
