package factory.data;

import model.TableInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import utils.Prop;
import utils.PropKit;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author maweijie
 * @create 2019-5-23
 **/
public abstract class GetDatabaseInfoAbstract implements GetDatabaseInfoFactory {
    protected static DataSource dataSource;
    protected static JdbcTemplate jdbcTemplate;

    static {
        Prop prop = PropKit.use("application.properties");
        dataSource = getDataSource(prop);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static DriverManagerDataSource getDataSource(Prop map) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(map.get("jdbc.driver"));
        dataSource.setUrl(map.get("jdbc.url"));
        dataSource.setUsername(map.get("jdbc.username"));
        dataSource.setPassword(map.get("jdbc.password"));
        return dataSource;
    }

    @Override
    public abstract List<TableInfo> getTable();
}
