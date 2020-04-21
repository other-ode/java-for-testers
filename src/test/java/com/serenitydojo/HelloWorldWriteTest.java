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

    @Test
    public void workingWithString(){
        String justPlainText = "Just Plain Text";

        System.out.println("Lower Case : " + justPlainText.toLowerCase());
        System.out.println("Upper Case : " + justPlainText.toUpperCase());
        System.out.println("Replace T with K : " + justPlainText.replace("t", "k"));

    }
}
