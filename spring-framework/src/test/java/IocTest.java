import com.example.aop.service.AopService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:35
 */
public class IocTest {
    ApplicationContext context=null;
    @Before
    public void init(){
        /*应用上下文*/
      context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context);
    }


    @Test
    public void test(){
        AopService iocService = context.getBean("iocService", AopService.class);
        iocService.insert("张三",22);
    }
}
