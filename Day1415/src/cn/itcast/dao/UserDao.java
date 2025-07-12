package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//操作user表的类

/**
 * loginUser只有用户名和密码
 * User有用户所有数据
 */
//声明JDBCTemplate对象共用

public class UserDao {
    //1.声明JDBCTemplate对象
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User loginUser){
        try {
            //1.编写sql语句
            String sql="select * from user where username=? and PASSWORD=?";
            //2.调用query方法
            User user=template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
