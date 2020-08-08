package com.itszt.dao;

public class UserDaoImpl implements UserDao {

    @Override
    public void sayHello(String data1, int data2) {
        System.out.println("data1 = " + data1+"  data2="+data2);
    }
}
