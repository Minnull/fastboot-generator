package $serviceImpl.packageName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import $model.fullClassName;
#if( $id.needImported() )
import $id.fullClassName;
#end
#if( $serviceImpl.packageName != $service.packageName )
import $service.fullClassName;
#end
#if( $serviceImpl.packageName != $dao.packageName )
import $dao.fullClassName;
#end

/**
 * $!{modelComment} 服务
 * 
 * @author $!{author} $!{generatedDate}
 */
@Service
public class $serviceImpl.shortClassName implements $service.shortClassName {
    private static final Logger logger = LoggerFactory.getLogger(${serviceImpl.shortClassName}.class);

    @Autowired
    private $dao.shortClassName ${dao.lowerCaseName};

    @Override
    public void save(${model.shortClassName} ${model.lowerCaseName}) {
        ${dao.lowerCaseName}.save(${model.lowerCaseName});
    }

    @Override
    public void updateById(${model.shortClassName} ${model.lowerCaseName}) {
        ${dao.lowerCaseName}.updateById(${model.lowerCaseName});
    }

    @Override
    public ${model.shortClassName} findById(${id.shortClassName} id) {
        return ${dao.lowerCaseName}.findById(id);
    }

    @Override
    public void deleteById(${id.shortClassName} id) {
        ${dao.lowerCaseName}.deleteById(id);
    }

}
