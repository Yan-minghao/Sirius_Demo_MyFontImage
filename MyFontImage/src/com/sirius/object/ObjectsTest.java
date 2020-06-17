package com.sirius.object;

import com.sirius.test.User;
import org.junit.Test;

import java.util.Objects;

public class ObjectsTest {

    @Test
    public void ObjectsTest(){
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
