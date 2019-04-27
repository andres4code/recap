package com.sda.tallinn6.fundamentals.loops;

public class WhileLoop {
    //a while loop is used to repeatedly execute a set of instructions
    //as long as its conditions evaluate to true
    public static void main(String[] args) {

        //Example 1
        System.out.println("Example 1");
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count after ++ operator is: " + count);
        }
        //Example 2
        System.out.println("Example 2");
        int num = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }
        //do-while
        System.out.println("First do-while example");
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        //////////////////////////////////////////
        //Example 4
        int x = 11;
        while (x <= 10) {
            System.out.println("x = " + x);
            x = x + 1;
        }

        //do-while runs before checking the conditions
        do {
            System.out.println("The value of x (in do-while) = " + x);
            x = x + 1;
        }
        while (x <= 10);

        /*
        //break says dont go on anymore - exit the loop
        int cnt = 1;
        while (cnt < 11) {
            System.out.println("Count after ++ operator is: " + cnt);
        }
        System.out.println("Loop ended");
         */

        //continue statement
        int cnt = 1;
        while (cnt < 12) {
            System.out.println("Count is : " + cnt);
            cnt++;
            if (cnt == 4) ;
            continue;
        }
        System.out.println("Count after ++ operator is " + cnt);

        //nested loop  INFINITE LOOP is WHILE-TRUE loop(needs BREAK to stop)
        //it means i write another loop inside a loop
        /*
        int z = 0;

        while (z < 10) {
            System.out.println("z: " + z);
            z += 1;
            while (z >= 10) {
                System.out.println("z: " + z);
                --z;
            }
            System.out.println("z: " + z);

        }
        int ctr = 12;
        for(int j=10,k=4;j<k;++j,k=k-1,ctr--) { //initialization; condition; action
            System.out.println("j: "+ j + "k: " + k + "ctr: " + ctr);
        }

        //int ctr = 12;
        //for(int j=10,k=4;j>k &&ctr > 10; ++j,);

         */

        //lets see how break and continue in for loop
        int nr = 10;
        for (int i = 0; i < nr; i++) {
            if (i > 5)
                continue; // Jumps to update, i++
            System.out.println("i: " + i);
        }

        //break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; //exit the loop
            }
            System.out.println(i);
        }
        //nested for loop
        for (int outer = 0; outer < 10; outer++) {
            for (int inner = 0; inner < 10; inner++) {
                System.out.println("inner: " + inner + " outer: " + outer);
            }
        }
        for (int hour = 0; hour < 12; hour++) { //write if to add another zero when hour is 0
            for (int minutes = 0; minutes < 60; minutes++) {
                System.out.println(hour + ":" + minutes);
            }
        }
    }
}
