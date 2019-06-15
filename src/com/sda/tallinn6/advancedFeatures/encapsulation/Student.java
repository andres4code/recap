package com.sda.tallinn6.advancedFeatures.encapsulation;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public Student(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public void setFirstName(String firstName) {//sulgudes on sisend
        this.firstName = firstName;//void means returns nothing
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void printDetails(){
        System.out.println("Student's first name is " + this.firstName);
        System.out.println("Student's last name is " + this.lastName);
        System.out.println("Student's age is " + this.age);
        System.out.println("Student is male? "  + this.isMale);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
