package com.myApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class helloWorldTest {

    @Test
    public void getHello() {
        helloWorld javahw = new helloWorld();

        assertEquals("Hello World" ,javahw.getHello());
    }
}