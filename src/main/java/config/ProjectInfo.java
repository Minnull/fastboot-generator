package config;

import factory.product.GeneratorPath;
import utils.PathUtil;

/**
 * @Auther: Administrator
 * @Date: 2019/5/19 14:56
 * @Description:
 */
public class ProjectInfo {

    public static String defaultTargetPath;

    public static String controllerTargetPath;
    public static String serviceTargetPath;
    public static String daoTargetPath;
    public static String mapperXmlTargetPath;

    public static String idType;
    public static String modelFullClassName;
    public static String mapperPackage;
    public static String daoPackage;
    public static String servicePackage;
    public static String controllerPackage;

    public static String modelComment;
    public static String author;

    public static String templateClassPath;

    static {
        defaultTargetPath = PathUtil.getClassPath(GeneratorPath.class, false) + "result/";
        templateClassPath = "/templates/lao/";

        controllerTargetPath = "";
        serviceTargetPath = "";
        daoTargetPath = "";
        mapperXmlTargetPath = "";

        idType = "";
        modelFullClassName = "";
        mapperPackage = "";
        daoPackage = "";
        servicePackage = "";
        controllerPackage = "";

        modelComment = "";
        author = "";
    }


}
