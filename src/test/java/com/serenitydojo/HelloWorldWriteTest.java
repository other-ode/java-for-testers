package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriteTest {

    @Test
    public void testWriteHelloWorld(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){
        Integer age = 40;
        age = age + 1;
        System.out.println("Age is " + age.toString());

        final int ageThiYear = 39;
        int ageNextYear = ageThiYear + 1;
        System.out.println("Current Age :" + ageThiYear);
        System.out.println("Next Age :" + ageNextYear);
        
        final double pi = 3.141592;
        long radius = 10;
        System.out.println("The Area of a circle of radius " + radius + " = " + (pi*radius*radius));
    }
}
