package factory.data;


import config.ProjectInfo;
import factory.scheme.BaseModel;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019/5/23 23:22
 * @Description:
 */
public abstract class GetTemplateAbstract implements GetTemplate {

    @Override
    public Template getTemplate(String templateFile) {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader(ProjectInfo.templateClassPath);
        Configuration cfg = null;
        try {
            cfg = Configuration.defaultConfiguration();
        } catch (IOException e) {
            System.out.println("GetTemplateAbstract类模板配置出错误了！");
            e.printStackTrace();
        }
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template template = gt.getTemplate(templateFile);
        return template;
    }

    @Override
    public String resolveTemplate(String templateName, Object object) {
        GetTemplateFactory getTemplateFactory = new GetTemplateFactory();
        Template template = getTemplateFactory.getTemplate(templateName);
        Map map = getTemplateFactory.transDataToMap(object);
        Template resolveTemplate = getTemplateFactory.replaceTemplate(map, template);
        String str = resolveTemplate.render();
        return str;
    }

    public Template replaceTemplate(Map map, Template template) {
        template.binding(map);
        return template;
    }

    @Override
    public Map transDataToMap(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (obj == null) {
            return null;
        }
        Field[] fields = obj.getClass().getDeclaredFields();//获取类的各个属性值
        for (Field field : fields) {
            String fieldName = field.getName();//获取类的属性名称
            if (getValueByFieldName(fieldName, obj) != null) {
                map.put(fieldName, getValueByFieldName(fieldName, obj));
            }
        }
        return map;
    }

    private static Object getValueByFieldName(String fieldName, Object object) {
        String firstLetter = fieldName.substring(0, 1).toUpperCase();
        String getter = "get" + firstLetter + fieldName.substring(1);
        try {
            Method method = object.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(object, new Object[]{});
            return value;
        } catch (Exception e) {
            return null;
        }
    }
}
