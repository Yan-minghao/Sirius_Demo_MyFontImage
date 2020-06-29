package com.sirius.test.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    @Test
    public void test() throws ParseException {
        /*Calendar instance = Calendar.getInstance();
        Long time = (instance.getTimeInMillis()/1000);
       *//* Date time1 = instance.getTime();
        System.out.println("time1:"+time1);
        System.out.println(time);*//*
        System.out.println(conversionTime(time.toString()));
        String date="2020-06-01 00:00:00";
        String startTime=date.substring(0, 10);
        System.out.println(startTime);*/

        /**
         * 生成DateFormat类对象的固定格式
         * */
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        /**
         * 获取日期转换为Unix时间戳
         */
        long epoch = (df.parse("2020-06-29 00:00:00").getTime())/1000;
        System.out.println(epoch);

    }


    //传入时间戳即可
    public String conversionTime(String timeStamp) {
        String p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(timeStamp)));
        return p;
    }

}
