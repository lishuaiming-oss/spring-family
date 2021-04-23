import com.example.aop.service.AopService;
import com.example.aop.poxy.AopServicePoxy;
import com.example.aop.service.impl.AopServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/16-16:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aop.xml")
public class AopJunit {

    @Autowired
     private AopService aopService;
    @Test
    public void test(){
        //aopService.delete("张三");
        aopService.update("李四",12);
       //  代理模式
       /* AopServicePoxy aopServicePoxy = new AopServicePoxy(aopService);
        aopServicePoxy.update("王三",25);*/

    }
}
