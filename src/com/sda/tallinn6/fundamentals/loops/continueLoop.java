package com.sda.tallinn6.fundamentals.loops;

public class continueLoop {

    public static void main(String[] args) {
        //continue statement
        int cnt = 1;
        while (cnt < 12) {
            System.out.println("Count is : " + cnt);
            cnt++;
            if(cnt == 4);
            continue;
        }
        System.out.println("Count after ++ operator is " + cnt);

    }
}
