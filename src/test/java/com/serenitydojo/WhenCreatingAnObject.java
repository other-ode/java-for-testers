package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingAnObject {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age = 3;

        Cat felix = new Cat("Felix","Tuna",3);
//        felix.name = "Felix";
//        felix.favouriteFood = "Tuna";
//        felix.age = 3;
        System.out.println("My " + felix.getAge() + " year old cat, named " + felix.getName() + " likes " + felix.getFavouriteFood());

        Cat jumbo = new Cat("Jumbo", "Salmon",7);
//        jumbo.name = "Jumbo";
//        jumbo.age = 7;
        System.out.println("My cat, " + jumbo.getName() + " is " + jumbo.getAge() + "year old");



    }
}
