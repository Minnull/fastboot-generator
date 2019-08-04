package factory.data;

import org.beetl.core.Template;

import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019/5/23 23:20
 * @Description:
 */
public interface GetTemplate {

    Template getTemplate(String templateFile);

    String resolveTemplate(String templateName, Object obj);

    Map<String,Object> transDataToMap(Object obj);
}
