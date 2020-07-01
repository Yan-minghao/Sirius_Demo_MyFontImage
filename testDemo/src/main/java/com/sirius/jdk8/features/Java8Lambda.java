package com.sirius.jdk8.features;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Java8Lambda {
    public static void main(String args[]) {
        Java8Lambda tester = new Java8Lambda();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

        ////////////////////////////////
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    @Test
    public void test01() {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        //使用 lambdas，可以通过下面的代码实现同样的功能:

        // 1.2 使用 lambda expression 排序 players
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players, sortByName);

        // 1.3 也可以采用如下形式:
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

        // 其他的排序如下所示。 和上面的示例一样,代码分别通过匿名内部类和一些lambda表达式来实现Comparator :

        // 1.1 使用匿名内部类根据 surname 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
            }
        });

        // 1.2 使用 lambda expression 排序,根据 surname
        Comparator<String> sortBySurname = (String s1, String s2) ->
                (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
        Arrays.sort(players, sortBySurname);

        // 1.3 或者这样,怀疑原作者是不是想错了,括号好多...
        Arrays.sort(players, (String s1, String s2) ->
                (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))))
        );

        // 2.1 使用匿名内部类根据 name lenght 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });

        // 2.2 使用 lambda expression 排序,根据 name lenght
        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());
        Arrays.sort(players, sortByNameLenght);

        // 2.3 or this
        Arrays.sort(players, (String s1, String s2) -> (s1.length() - s2.length()));

        // 3.1 使用匿名内部类排序 players, 根据最后一个字母
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });

        // 3.2 使用 lambda expression 排序,根据最后一个字母
        Comparator<String> sortByLastLetter =
                (String s1, String s2) ->
                        (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(players, sortByLastLetter);

        // 3.3 or this
        Arrays.sort(players, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));
    }
}
