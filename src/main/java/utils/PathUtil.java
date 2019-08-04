package utils;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Administrator
 * @Date: 2019/5/26 18:40
 * @Description:
 */
public class PathUtil {

    /**
     *
     * 功能描述: 
     *
     * @param: clz 类
     * @param: openFloder 是否打开类所在文件夹
     * @return:
     * @auther: Administrator
     * @date: 2019/5/26 19:36
     * @description: 
     */
    public static String getClassPath(Class<?> clz,boolean openFloder) {
        String path = clz.getResource("").getPath();
        String substring = path.substring(path.indexOf("/") + 1);
        String replaceAll = substring.replaceAll("target/classes", "src/main/java");
        boolean exist = FileUtil.exist(replaceAll);
        if (!exist) {
            System.out.println("文件夹不存在！");
        }
        if (openFloder) {
            try {
                java.awt.Desktop.getDesktop().open(new File(replaceAll));
            } catch (IOException e) {
                System.out.println("文件夹打开失败！");
            }
        }
        System.out.println("输出类所在文件夹绝对路径：" + replaceAll);
        return replaceAll;
    };

}
