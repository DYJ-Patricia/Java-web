package cn.itcast.datasource.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        InputStream is=DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        System.out.println(is);
        DataSource ds=new DruidDataSourceFactory().createDataSource(pro);
        Connection conn=ds.getConnection();
        System.out.println(conn);
    }
}
