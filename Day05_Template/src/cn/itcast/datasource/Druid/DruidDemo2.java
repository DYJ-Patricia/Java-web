package cn.itcast.datasource.Druid;

import cn.itcast.Utils.JDBCUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示Druid的工具类使用
 */
public class DruidDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn = JDBCUtils.getConnection();
        String sql = "insert into account values(null,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "liuer");
        pstmt.setDouble(2, 1000);
       int count = pstmt.executeUpdate();
        System.out.println(count);
        JDBCUtils.close(null, conn, pstmt);
    }
}
