package model;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 14:22
 * @Description:
 */
public class TableColumnInfo {

    private static final long serialVersionUID = 1L;

    /** 字段名称 */
    private String columnName;

    /** 字段类型 */
    private String dataType;

    /** 列描述 */
    private String columnComment;

    /** 是否主键 */
    private Boolean primaryKey;


    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }
}
