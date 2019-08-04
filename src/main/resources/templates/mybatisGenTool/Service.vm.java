/**
 * 
 */
package $service.packageName;

import $model.fullClassName;
#if( $id.needImported() )
import $id.fullClassName;
#end

/**
 * $!{modelComment} 服务
 * 
 * @author $!{author} $!{generatedDate}
 */
public interface $service.shortClassName {
    
    void save(${model.shortClassName} ${model.lowerCaseName});

    void updateById(${model.shortClassName} ${model.lowerCaseName});

    ${model.shortClassName} findById(${id.shortClassName} id);

    void deleteById(${id.shortClassName} id);


}
