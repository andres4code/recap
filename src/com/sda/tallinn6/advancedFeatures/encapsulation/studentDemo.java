package com.sda.tallinn6.advancedFeatures.encapsulation;

//constructor is to build an object
//!!!!!Constructor is like a method BUT doesnt have RETURN TYPE, Constructor has SAME NAME AS CLASS NAME

import com.sda.tallinn6.advancedFeatures.encapsulation.Student;

public class studentDemo {



    public static void main(String[] args) {

        Student student1 = new Student("Ayomide","Johnson",12,true);//new object creatio

        student1.setFirstName("Ayomide");
        student1.setLastName("Johnson");
        student1.setAge(12);
        student1.setMale(true);

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getAge());
        System.out.println(student1.isMale());

        Student student2 = new Student("Mark","Facebook",29,true);
        student2.setFirstName("Mark");
        student2.setLastName("Facebook");
        student2.setAge(29);
        student2.setMale(true);

        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getAge());
        System.out.println(student2.isMale());

        student1.printDetails();
        student2.printDetails();


    }
}
