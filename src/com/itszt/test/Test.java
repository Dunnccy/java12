package com.itszt.test;

import com.itszt.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
@org.junit.Test
    public  void  testhello(){
    //因为我们的new对象都交给了IoC完成 所以我们用对象的时候直接跟IoC要就可以了
    //1.找到IoC的大工厂---Spring上下文容器
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
    //2跟工厂要bean
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
    userDao.sayHello("hehe",1);
    userDao.sayHello("xxx",555);

}


}
