package com.myApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class helloWorldTest {

    @Test
    void getHello() {
        helloWorld javahw = new helloWorld();

        assertEquals("Hello World" ,javahw.getHello());
        System.out.println("From Junit5");
    }
}