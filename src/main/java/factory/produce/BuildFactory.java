package factory.produce;

import com.google.common.collect.Lists;
import factory.data.GetTemplateFactory;
import model.TableInfo;

import java.util.List;


/**
 * Created by 张钦 on 2016/6/16.
 */
public class BuildFactory extends IBuildAbstract {

    @Override
    public void build(List<TableInfo> tables) {
        super.build(tables);
        for (TableInfo table : tables) {
            GetTemplateFactory.resolveDao(table);
        }
    }

    public static void main(String[] args) {
        List<TableInfo> list = Lists.newArrayList();
        TableInfo tableInfo = new TableInfo();
        tableInfo.setTableName("Haha");
        list.add(tableInfo);
        BuildFactory buildFactory = new BuildFactory();
        buildFactory.build(list);
    }

}
