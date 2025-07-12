package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类
 * 使用Druid连接池
 */
public class JDBCUtils {
    private static DataSource ds;
    static {
        //1.加载配置文件
        Properties pro=new Properties();

        //使用ClassLoader加载配置文件,获取字节输入流
        InputStream is=JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.创建连接池对象
        try {
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 获取连接池对象
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }
    /**
     * 获取connection对象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
