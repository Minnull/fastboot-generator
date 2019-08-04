package factory.data;/**
 * Created by zhangqin on 2017/5/12.
 */

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import model.TableColumnInfo;
import model.TableInfo;
import org.apache.commons.lang3.StringUtils;
import utils.PropKit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 获取表和字段结构
 *
 * @author
 * @create 2019年5月19日
 **/
public class GetDatabaseInfoMysql extends GetDatabaseInfoAbstract {

    @Override
    public List<TableInfo> getTable() {
        String tableSql = "select * from information_schema.tables where table_schema=? and table_type='base table'";
        String columnSql = "SELECT *  FROM information_schema.`COLUMNS` where TABLE_NAME = ? and TABLE_SCHEMA =?";
        List<TableInfo> listTable = new ArrayList<TableInfo>();
        String databaseStr = PropKit.use("application.properties").get("jdbc.database");
        Object[] database = {databaseStr};
        List<Map<String, Object>> tableMap = jdbcTemplate.queryForList(tableSql, database);
        for (Map<String, Object> map : tableMap) {
            TableInfo table = new TableInfo();
            String tableName = String.valueOf(map.get("TABLE_NAME"));
            String tableComment = String.valueOf(map.get("TABLE_COMMENT"));
            String createTime = String.valueOf(map.get("CREATE_TIME"));
            table.setTableName(tableName);
            table.setTableComment(tableComment);
            table.setCreateTime(createTime);
            Object[] databaseAndTable = {tableName, databaseStr};
            List<Map<String, Object>> columnMap = jdbcTemplate.queryForList(columnSql, databaseAndTable);
            List<TableColumnInfo> tableColumns = Lists.newArrayList();
            for (Map<String, Object> stringObjectMap : columnMap) {
                TableColumnInfo tableColumn = new TableColumnInfo();
                tableColumn.setColumnName(String.valueOf(stringObjectMap.get("COLUMN_NAME")));
                if (StringUtils.isNotBlank(String.valueOf(stringObjectMap.get("COLUMN_KEY")))) {
                    tableColumn.setPrimaryKey(true);
                    table.setTableName(tableColumn.getColumnName());
                } else {
                    tableColumn.setPrimaryKey(false);
                }
                tableColumn.setDataType(String.valueOf(stringObjectMap.get("DATA_TYPE")));
                tableColumn.setColumnComment(String.valueOf(stringObjectMap.get("COLUMN_COMMENT")));
                tableColumns.add(tableColumn);
            }
            table.setColumns(tableColumns);
            listTable.add(table);

        }
        return listTable;
    }

    public static void main(String[] args) {
        GetDatabaseInfoFactory getTableFactory = new GetDatabaseInfoMysql();
        System.out.println(JSON.toJSONString(getTableFactory.getTable()));
    }
}
