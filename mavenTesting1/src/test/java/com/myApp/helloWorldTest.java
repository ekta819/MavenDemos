package com.myApp;
public class helloWorldTest {
    public void testGetHello() {

        helloWorld javahw = new helloWorld();

        assert("Hello World".equals(javahw.getHello()));
    }
}