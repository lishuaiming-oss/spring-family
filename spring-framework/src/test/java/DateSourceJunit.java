import com.example.jdbc.service.JdbcService;
import com.example.jdbc.switcher.DataSourceSwitcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/19-16:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-datasource2.xml")
public class DateSourceJunit {

   @Autowired
   private JdbcService jdbcService;
    @Test
    public void test() throws SQLException {
//       System.out.println(dataSource);//
//       jdbcService.insert("dataSource",13);
//
       //jdbcService.insert("dataSource87",16);
        List<Map<String, Object>> list = jdbcService.query();
         for (Map<String, Object> map:list){
           System.out.println(map);
       }
    }
}
