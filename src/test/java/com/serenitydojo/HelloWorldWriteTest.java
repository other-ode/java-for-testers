package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriteTest {

    @Test
    public void testWriteHelloWorld(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}
