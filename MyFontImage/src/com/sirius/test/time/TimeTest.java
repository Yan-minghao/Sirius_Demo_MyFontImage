package com.sirius.test.time;

import org.junit.Test;

import java.util.Calendar;

public class TimeTest {

    @Test
    public void test(){
        //获取系统当前时间
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
//        int month = now.get(Calendar.MONTH) + 1;
        System.out.println("year"+year+"___"+"month::::"+month);
    }

}
