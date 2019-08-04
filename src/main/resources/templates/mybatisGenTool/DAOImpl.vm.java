package $daoImpl.packageName;

#if( $hasCreatedAtField )
import java.util.Date;
#end
#if( $id.needImported() )
import $id.fullClassName;
#end
#if( $id.shortClassName == "String" )
import org.apache.commons.lang3.StringUtils;
#end

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.base.Preconditions;
import ${mapperPackage}.${model.shortClassName}Mapper;
import ${model.fullClassName};
#if( $daoImpl.packageName != $dao.packageName )
import $dao.fullClassName;
#end


/**
 * $!{modelComment} 数据服务
 *
 * @author $!{author} $!{generatedDate}
 */
@Repository
public class $daoImpl.shortClassName implements ${model.shortClassName}DAO {

    @Autowired
    private ${model.shortClassName}Mapper ${model.lowerCaseName}Mapper;

    @Override
    public void save(${model.shortClassName} ${model.lowerCaseName}) {
        Preconditions.checkNotNull(${model.lowerCaseName});
#if( $hasCreatedAtField )
        ${model.lowerCaseName}.setCreatedAt(new Date());
#end
#if( $hasUpdatedAtField )
        ${model.lowerCaseName}.setUpdatedAt(new Date());
#end
        ${model.lowerCaseName}Mapper.insertSelective(${model.lowerCaseName});
    }

    @Override
    public void updateById(${model.shortClassName} ${model.lowerCaseName}) {
        Preconditions.checkNotNull(${model.lowerCaseName});
#if( $hasUpdatedAtField )
        ${model.lowerCaseName}.setUpdatedAt(new Date());
#end
        ${model.lowerCaseName}Mapper.updateByIdSelective(${model.lowerCaseName});
    }

    @Override
    public ${model.shortClassName} findById(${id.shortClassName} id) {
#if( ${id.shortClassName} == "String" )
        Preconditions.checkArgument(StringUtils.isNotEmpty(id));
#elseif($id.isNullable() )
        Preconditions.checkNotNull(id);
#end
        return ${model.lowerCaseName}Mapper.selectById(id);
    }

    @Override
    public void deleteById(${id.shortClassName} id) {
#if( ${id.shortClassName} == "String" )
        Preconditions.checkArgument(StringUtils.isNotEmpty(id));
#elseif($id.isNullable() )
        Preconditions.checkNotNull(id);
#end
        ${model.lowerCaseName}Mapper.deleteById(id);
    }


}
