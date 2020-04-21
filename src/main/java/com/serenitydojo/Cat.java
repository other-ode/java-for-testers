package com.serenitydojo;

public class Cat {

    private String name;
    private String favouriteFood;
    private int age;

     public Cat(String name, String favouriteFood, int age){
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getFavouriteFood(){
        return favouriteFood;
    }

    public int getAge(){
        return age;
    }
}
