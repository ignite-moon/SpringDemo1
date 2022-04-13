import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {

    @Before
    public void before(){
        //初始化ApplicationContext和userService
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-service.xml","classpath:spring-dao.xml");
        UserService userService=(UserService) ac.getBean("userService");
    }
    @Test
    public void asd(){
        //ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-service.xml","classpath:spring-dao.xml");
        //applicationContext.xml为spring-service、spring-dao、spring-mvc的结合体，经测试成功
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");

//        User user=new User();
//        user.setId(9);
//        user.setName("sss");
//        user.setPassword("357");
//        userService.insert(user);
//
//        userService.deleteById(2);
//
//        User u=new User();
//        u.setId(7);
//        u.setPassword("999");
//        userService.updateById(u);

        List<User> users=userService.selectAll();
        System.out.println(users);

        /*  //不使用userService，直接用userMapper
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        List<User> users = userMapper.selectAll();
        System.out.println(users);*/
    }
}
