package statics;

import model.TableColumnInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 18:55
 * @Description:
 */
public class DataType2JavaType {

    private static Map<String, String> javaTypeMap;

    static {
        javaTypeMap = new HashMap<String, String>();
        javaTypeMap.put("varchar2", "java.lang.String");
        javaTypeMap.put("varchar", "java.lang.String");
        javaTypeMap.put("char", "java.lang.String");
        javaTypeMap.put("blob", "java.lang.String");
        javaTypeMap.put("text", "java.lang.byte[]");
        javaTypeMap.put("integer", "java.lang.Integer");
        javaTypeMap.put("int", "java.lang.Integer");
        javaTypeMap.put("tinyint", "java.lang.Integer");
        javaTypeMap.put("smallint", "java.lang.Integer");
        javaTypeMap.put("mediumint", "java.lang.Integer");
        javaTypeMap.put("bit", "java.lang.Boolean");
        javaTypeMap.put("bigint", "java.math.BigInteger");
        javaTypeMap.put("float", "java.lang.Float");
        javaTypeMap.put("double", "java.lang.Double");
        javaTypeMap.put("decimal", "java.math.BigDecimal");
        javaTypeMap.put("date", "java.sql.Date");
        javaTypeMap.put("time", "java.sql.Time");
        javaTypeMap.put("datetime", "java.sql.Timestamp");
        javaTypeMap.put("timestamp", "java.sql.Timestamp");
    }

    public static String getJavaType(TableColumnInfo tableColumn) {
        return getDataType(tableColumn);
    }


    public static String getDataType(TableColumnInfo tableColumn) {
        String type = javaTypeMap.get(tableColumn.getDataType());
        return type;
    }
}
