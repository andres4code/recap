package com.sda.tallinn6.fundamentals.loops;

public class ForLoop {
    //in while loop we define counter outside loop
    //in FOR loop, we define everything in one line(PREFERRED by devs)
    public static void main(String[] args) {

        for (int i=1; i<11; i++) { //1)beginning value; 2)condition when to work; 3)what to do
            System.out.println("Count is: " + i); //i-- is also possible(best with i>0)
        }
        //infinite loop


    }
}
