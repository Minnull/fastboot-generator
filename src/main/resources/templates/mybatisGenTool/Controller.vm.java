/**
 *
 */
package $controller.packageName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krspace.framework.beans.JsonResponse;

import $model.fullClassName;
#if( $id.needImported() )
import $id.fullClassName;
#end
#if( $controller.packageName != $service.packageName )
import $service.fullClassName;
#end

/**
 * $!{modelComment} 控制器
 *
 * @author $!{author} $!{generatedDate}
 */
@RestController
@RequestMapping("")
public class $controller.shortClassName {
    private static final Logger logger = LoggerFactory.getLogger(${controller.shortClassName}.class);

    @Autowired
    private $service.shortClassName ${service.lowerCaseName};

    @RequestMapping(value = "${scheme.hyphenCaseName}", method = RequestMethod.GET)
    public JsonResponse list(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        // TODO 请确认自动生成的url是否合理
        return JsonResponse.success();
    }

    @RequestMapping(value = "${scheme.hyphenCaseName}/{id}", method = RequestMethod.GET)
    public JsonResponse view(@PathVariable("id") ${id.shortClassName} id) {
        // TODO 请确认自动生成的url是否合理
        $model.shortClassName ${model.lowerCaseName} = ${service.lowerCaseName}.findById(id);
        return JsonResponse.success(${model.lowerCaseName});
    }

    @RequestMapping(value = "${scheme.hyphenCaseName}", method = RequestMethod.POST)
    public JsonResponse add() {
        // TODO 请确认自动生成的url是否合理
        // ${service.lowerCaseName}.save(null);
        return JsonResponse.success();
    }

    @RequestMapping(value = "${scheme.hyphenCaseName}/{id}", method = RequestMethod.PUT)
    public JsonResponse edit(@PathVariable("id") ${id.shortClassName} id) {
        // TODO 请确认自动生成的url是否合理
        // ${service.lowerCaseName}.updateById(id);
        return JsonResponse.success();
    }

    @RequestMapping(value = "${scheme.hyphenCaseName}/{id}", method = RequestMethod.DELETE)
    public JsonResponse delete(@PathVariable("id") ${id.shortClassName} id) {
        // TODO 请确认自动生成的url是否合理
        // ${service.lowerCaseName}.deleteById(id);
        return JsonResponse.success();
    }

}
