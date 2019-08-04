package model;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 14:02
 * @Description:
 */
public class ClassInfo {

    private static final long serialVersionUID = 1L;

    /** 表名称 */
    private String tableName;

    /** Java类名 */
    private String className;

    /** Java类注释 */
    private String classComment;

    /** Java类属性 */
    private List<ClassFieldInfo> fieldList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassComment() {
        return classComment;
    }

    public void setClassComment(String classComment) {
        this.classComment = classComment;
    }

    public List<ClassFieldInfo> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<ClassFieldInfo> fieldList) {
        this.fieldList = fieldList;
    }
}
