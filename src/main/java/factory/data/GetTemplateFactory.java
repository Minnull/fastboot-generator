package factory.data;

import factory.scheme.BaseModel;
import factory.scheme.DaoModel;
import model.TableInfo;
import org.beetl.core.Template;

import java.util.UUID;


/**
 * @Auther: Administrator
 * @Date: 2019/5/23 23:30
 * @Description:
 */
public class GetTemplateFactory extends GetTemplateAbstract{

    @Override
    public Template getTemplate(String templateFile) {
        return super.getTemplate(templateFile);
    }

    @Override
    public String resolveTemplate(String templateName, Object object){
        BaseModel baseModel =(BaseModel)object;
        return super.resolveTemplate(templateName, baseModel);
    }

    public static void main(String[] args){
        TableInfo tableInfo = new TableInfo();
        UUID.randomUUID();
        GetTemplateFactory.resolveDao(tableInfo);
    }

   public static String resolveDao(TableInfo tableInfo){
       GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
       DaoModel daoModel = new DaoModel();
       daoModel.setBeanName(tableInfo.getTableName());
       String resolve = getTemplateFactory.resolveTemplate("consoleDao.temp", daoModel);
       System.out.println(resolve);
        return resolve;
    }

    public static String resolveMapperXml(TableInfo tableInfo){
        GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
        DaoModel daoModel = new DaoModel();
        daoModel.setBeanName("测试");
        String resolve = getTemplateFactory.resolveTemplate("consoleDao.temp", daoModel);
        System.out.println(resolve);
        return resolve;
    }

    public static String resolveController(TableInfo tableInfo){
        GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
        DaoModel daoModel = new DaoModel();
        daoModel.setBeanName("测试");
        String resolve = getTemplateFactory.resolveTemplate("consoleDao.temp", daoModel);
        System.out.println(resolve);
        return resolve;
    }

    public static String resolveService(TableInfo tableInfo){
        GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
        DaoModel daoModel = new DaoModel();
        daoModel.setBeanName("测试");
        String resolve = getTemplateFactory.resolveTemplate("consoleDao.temp", daoModel);
        System.out.println(resolve);
        return resolve;
    }

    public static String resolveServiceImpl(TableInfo tableInfo){
        GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
        DaoModel daoModel = new DaoModel();
        daoModel.setBeanName("测试");
        String resolve = getTemplateFactory.resolveTemplate("consoleDao.temp", daoModel);
        System.out.println(resolve);
        return resolve;
    }
}
