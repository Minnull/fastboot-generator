package model;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 14:21
 * @Description:
 */
public class TableInfo {

    private static final long serialVersionUID = 1L;

    /** 表名称 */
    private String tableName;

    /** 表描述 */
    private String tableComment;

    /** 表创建时间*/
    private String createTime;

    /** 表的列名 */
    private List<TableColumnInfo> columns;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<TableColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(List<TableColumnInfo> columns) {
        this.columns = columns;
    }
}
