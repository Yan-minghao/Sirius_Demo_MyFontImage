package com.sirius.test;

public class DTest {
    public static void main(String[] args) {
        String s = null;
        assert s != null ? true : false;
        assert false;
        System.out.println("end");
    }
}
