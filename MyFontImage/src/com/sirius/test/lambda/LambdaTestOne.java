package com.sirius.test.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTestOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        //集合.forEach(()-> );
        // 使用 lambda 表达式以及函数操作(functional operation)
        list.forEach((li) -> System.out.println(li));
        System.out.println("111111111111111");
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        list.forEach(System.out::println);
    }
}
