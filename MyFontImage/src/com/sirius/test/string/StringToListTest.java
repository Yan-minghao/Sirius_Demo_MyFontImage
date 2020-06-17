package com.sirius.test.string;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StringToListTest {

    public List testStringToList(String[] strings) {
        //String 数组 如何转集合
        //        String[] s = {"a","b","c"};
        List list = Arrays.asList(strings);
        return list;
    }

    public List testStringToListNew(String string) {
        //String 字符串转集合
        /*String s = "123,456,789";*/
        List list = Arrays.asList(string.split(","));
        return list;
    }

    public String testListToString(List list) {
        String join = StringUtils.join(list, ",");
        return join;
    }

}
