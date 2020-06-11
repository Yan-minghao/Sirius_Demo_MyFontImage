package com.sirius.utils;

import com.sirius.vo.User;
import org.junit.Test;

import java.util.Calendar;
import java.util.Objects;

public class DateTestDemo {
    @Test
    public void test(){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
//        int month = now.get(Calendar.MONTH) + 1;
        System.out.println("year"+year+"___"+"month::::"+month);
    }
    @Test
    public void objectsTest(){
        User user = new User();
        User user2 = new User();
        //1.测试Objects isNull
        System.out.println("isNull:"+Objects.isNull(user));
        //2.测试Objects nonNull
        System.out.println("nonNull:"+Objects.nonNull(user));
        //3.测试Objects requireNonNull
        System.out.println("requireNonNull:"+Objects.requireNonNull(user));
        //4.测试Objects requireNonNull(T obj,String message)
        System.out.println("requireNonNull:"+Objects.requireNonNull(user,"null"));
    }
}
