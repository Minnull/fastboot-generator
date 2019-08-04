package factory.produce;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.ClassUtil;
import config.ProjectInfo;
import factory.data.GetTemplate;
import factory.data.GetTemplateFactory;
import factory.product.GeneratorPath;
import model.TableInfo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;


/**
 * @Auther: Administrator
 * @Date: 2019/5/25 22:11
 * @Description:
 */
public abstract class IBuildAbstract implements IBuild{

    private static String path = ProjectInfo.defaultTargetPath;

    @Override
    public void build(List<TableInfo> tables) {
        boolean windows = FileUtil.isWindows();
        if (!windows){
            System.out.println("环境目前只支持window！");
            System.exit(0);
        }
        IBuildAbstract.mkdir(path);
        boolean exist = FileUtil.exist(path);
        if (!exist){
            System.out.println("文件夹不存在！");
            System.exit(0);
        }
        try {
            java.awt.Desktop.getDesktop().open(new File(path));
        } catch (IOException e) {
            System.out.println("打开文件夹失败！");
            e.printStackTrace();
        }
        FileUtil.clean(path);
        System.out.println("清理文件夹完成！");
    }

    public static void main(String[] args)  {
//        IBuildAbstract.writeString(GetTemplateFactory.getTest(),path,"test.java");
    }

    private static void mkdir(String path) {
        FileUtil.mkdir(path);
    }

    private static void writeString(String content, String floder, String fileName) {
        String targetPath = floder + fileName;
        FileUtil.writeString(content, targetPath, Charset.forName(CharsetUtil.UTF_8));
    }

    /**
     * @description: 只清理文件夹下面的文件，文件夹保留
     */
    private static void clean(String path) {
        FileUtil.clean(path);
    }

    /**
     * @description: 文件夹和下面的文件全部删除
     */
    private static void del(String path) {
        FileUtil.del(path);
    }
}
