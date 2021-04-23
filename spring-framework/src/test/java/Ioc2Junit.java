import com.example.ioc2.service.IocService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-ioc2.xml")
public class Ioc2Junit {

    @Resource
    private IocService iocService;
    @Test
    public void test(){
        iocService.delete("李");
    }
}
