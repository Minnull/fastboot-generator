package $dao.packageName;

import $model.fullClassName;
#if( $id.needImported() )
import $id.fullClassName;
#end
/**
 * $!{modelComment} 数据服务
 *
 * @author $!{author} $!{generatedDate}
 */
public interface $dao.shortClassName {

    void save(${model.shortClassName} ${model.lowerCaseName});

    void updateById(${model.shortClassName} ${model.lowerCaseName});

    ${model.shortClassName} findById(${id.shortClassName} id);

    void deleteById(${id.shortClassName} id);
}
