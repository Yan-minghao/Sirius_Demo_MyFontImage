package java.com.sirius.test.guava;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * 简洁化代码 Guava
 * https://developer.aliyun.com/article/764958?utm_content=g_1000144250
 * */
public class GuavaDemoTest {
    @Test
    public void BigDecimalTest() {
        //    list中的值求和
        //    原始做法：
        List<BigDecimal> numList = new ArrayList<BigDecimal>(10) {{
            add(BigDecimal.valueOf(111L));
            add(BigDecimal.valueOf(8888.22));
            add(BigDecimal.valueOf(333.22));
            add(BigDecimal.valueOf(857857.22));
            add(BigDecimal.valueOf(5331.22));
        }};
        BigDecimal total = BigDecimal.ZERO;
        for (
                BigDecimal num : numList) {
            total = total.add(num);
        }
        System.out.println(total);
        //    简化一下：
        List<BigDecimal> numListSimple = ImmutableList.of(BigDecimal.valueOf(111L)
                , BigDecimal.valueOf(8888.22), BigDecimal.valueOf(333.22)
                , BigDecimal.valueOf(857857.22), BigDecimal.valueOf(5331.22));
        // 求和
        BigDecimal totalNum = BigDecimal.valueOf(numListSimple.stream().mapToDouble(BigDecimal::doubleValue).sum());
    }

    //    判断值是否为空
    //    原始写法：
    public static String getUserName() {
        return null;
    }

    public static void main(String[] args) {
        String username = getUserName();
        String res;
        if (username != null) {
            res = username;
        } else {
            res = "游客";
        }
        //    简化：
        String userName = Optional.ofNullable(username).orElse("游客");
        System.out.println(userName);
    }
}

