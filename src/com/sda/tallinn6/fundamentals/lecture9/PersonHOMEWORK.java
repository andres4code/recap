package com.sda.tallinn6.fundamentals.lecture9;

import java.util.ArrayList;
import java.util.List;

public class PersonHOMEWORK {
    public static void main(String[] args) {
        Person person1 = new Person("Jeff", 21);//object is created
        Person person2 = new Person("Mike", 99);
        Person person3 = new Person("Sten", 19);
        Person person4 = new Person("Karl", 29);
        Person person5 = new Person("Mart", 43);
        List<Person> listOfPeople = new ArrayList<>();//person in <> because thats what you put in Arraylist
        //add 5 people to list
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.add(person5);

        System.out.println(listOfPeople);

        Person firstPerson = listOfPeople.get(0);//this goes in for loop to reach each array

        System.out.println(firstPerson.getName() + " " + firstPerson.getAge());

        System.out.println("For loop normal");
        //print all person name and age out with loop
        int sizeOfList=listOfPeople.size();
        for(int counter = 0; counter < listOfPeople.size(); counter++){
            System.out.println(listOfPeople.get(counter).getName()+ " "+ listOfPeople.get(counter).getAge());

        }
        System.out.println("||||||||||||||||");
        System.out.println("For EACH loop");
        //for each loop- gets next thing until it finishes
        for(Person someone:listOfPeople){//someone is person , first element of the list etc
            System.out.println(someone.getName() + " " + someone.getAge());
        }

    }
}
