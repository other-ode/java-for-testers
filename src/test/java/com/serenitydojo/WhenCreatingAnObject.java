package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingAnObject {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age = 3;

        Cat felix = new Cat();
        felix.name = "Felix";
        felix.favouriteFood = "Tuna";
        felix.age = 3;

        System.out.println("My " + felix.age + " year old cat, named " + felix.name + " likes " + felix.favouriteFood);

        Cat jumbo = new Cat();
        jumbo.name = "Jumbo";
        jumbo.age = 7;
        System.out.println("My cat, " + jumbo.name + " is " + jumbo.age + "year old");



    }
}
