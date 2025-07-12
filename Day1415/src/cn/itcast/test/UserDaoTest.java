package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;


public class UserDaoTest {

    @Test
    public void testLogin(){
        User loginuser=new User();

        loginuser.setUsername("super");
        loginuser.setPassword("123");

        UserDao userDao=new UserDao();
        User user=userDao.login(loginuser);

        System.out.println(user);
    }
}
