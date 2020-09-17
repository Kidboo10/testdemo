package com.example.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();

    @Test
    void testHelloWorldGreeting() {
        String result = helloWorld.HelloWorldGreeting();
        Assertions.assertEquals("Hello World", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme