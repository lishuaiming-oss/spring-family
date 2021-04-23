package com.example.jdbc.switcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Map;


/**
 * @programe: spring-family
 * @Description:
 * @Author: li shuai ming
 * @Create: 2021/4/20-14:51
 */
@Component
public class DataSourceSwitcher extends AbstractRoutingDataSource {
    //绑定相关数据源到当前线程
     private static final ThreadLocal<String> dataSourceKey =new ThreadLocal<>();
    @Autowired
    public void DataSourceSwitcher(DataSource dataSource1,DataSource dataSource2) {
      /*  System.out.println(dataSource1);
        System.out.println("------------------------------");
        System.out.println(dataSource2);
        super.setTargetDataSources(Map.of(dataSource1,dataSource2));*/
       //设置默认数据源
       super.setDefaultTargetDataSource(dataSource1);
       //设置数据源客源列表
       super.setTargetDataSources(Map.of("dataSource1",dataSource1,"dataSource2",dataSource2));

    }

    /**
     * 获取当前操作数据源
     * @return 数据源
     */
    @Override
   protected  Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
    /**
     * 清空数据源列表
     */
    public static void defaultDataSurce() {
      //  System.out.println( Thread.currentThread().getName() );
        dataSourceKey.remove();
    }
    /**
     * 动态切换绑定数据源
     * @param dataSource 当前数据源
     */
    public static void setDataSourceKey() {
        dataSourceKey.set("dataSource2");

    }


}
