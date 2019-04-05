package cn.itcast.gjp.tools;

import com.mchange.v2.c3p0.*;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class JDBCUtils {
    private static ComboPooledDataSource datasource = new ComboPooledDataSource();
    static{
        try {
            datasource.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        datasource.setJdbcUrl("jdbc:mysql://localhost:3306/gjp");
        datasource.setUser("root");
        datasource.setPassword("123");
//        datasource.setMaxActive(10);
//        datasource.setMaxIdle(5);
//        datasource.setMinIdle(2);
//        datasource.setInitialSize(10);
    }
    public static DataSource getDataSource(){
        return datasource;
    }
}
