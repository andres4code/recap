package com.sda.tallinn6.fundamentals.lecture9;

public class Person {//rightclick generate constructor or control n
        String name;
        int age;

    public String getName() { //these getters and setter you get with control n key or rightclick
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { //VERY IMPORTANT toSTRING(so you can print out the array not empty!!!)
        return "\n" + "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

