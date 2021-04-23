package com.example.ioc2.service;
import com.example.ioc2.dao.IocDao;
import com.example.ioc2.service.IocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/15-10:32
 */
@Service
public class IocServiceImpl  implements IocService {

   /* public IocServiceImpl() {
        System.out.println("service init");
    }*/
    @Autowired
      private IocDao iocDao;
    @Value("#{properties.username}")
      private String username;

    @Override
    public void insert(String name, int age) {
        System.out.println("IocService insert method()");
    }

    @Override
    public void insert(String name) {

    }

    @Override
    public void insert(int age) {

    }

    @Override
    public void delete(String name) {
        iocDao.delete(name);
        System.out.println("name:"+username);
    }


}
