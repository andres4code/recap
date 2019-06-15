package com.sda.tallinn6.fundamentals.lecture9;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample { //last item is the first to remove, LIFO

    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();//creates new queue

        waitingQueue.add("Kaspar");
        waitingQueue.add("Pavel");
        waitingQueue.add("Vladimir");
        waitingQueue.add("Heidi");//add is inserting in queue

        System.out.println("waiting queue: " + waitingQueue);

        String name = waitingQueue.remove();//removes from queue(gives error if empty)
        System.out.println("removed thing is: " + name);

        name = waitingQueue.poll();//poll is getting and removing, to operate with it
        System.out.println("polled(removed) thing is: " + name); //poll gives null if empty during operation
        System.out.println(waitingQueue);

    }
}
