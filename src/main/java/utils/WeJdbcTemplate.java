package utils;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


public class WeJdbcTemplate {

    private static DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;

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

    public static List<Map<String, Object>> getAllTableFromDb(String table_schema) {
        String sql = "SELECT table_name FROM information_schema.tables WHERE table_schema = '" + table_schema + "'";
        List<Map<String, Object>> tableNameList = jdbcTemplate.queryForList(sql);
        return tableNameList;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> data = WeJdbcTemplate.getAllTableFromDb("user");
        System.out.println(data);
    }
}
