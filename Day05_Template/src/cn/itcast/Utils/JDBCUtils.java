package cn.itcast.Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;
    static {
        try{
            Properties pro=new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds=DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static DataSource getDataSource() {
        return ds;
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    public static void close(ResultSet rs, Connection conn, Statement stmt){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       if (stmt!= null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close (Connection conn,Statement stmt){
         close(null,conn,stmt);
    }
}
