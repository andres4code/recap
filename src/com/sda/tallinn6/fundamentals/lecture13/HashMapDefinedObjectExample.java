package com.sda.tallinn6.fundamentals.lecture13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Customer> employeesMap = new HashMap<>();
        Customer insertingObject = new Customer(1, "Basaran");
        employeesMap.put(1, insertingObject);
        employeesMap.put(2, new Customer(2, "Asli"));
        employeesMap.put(3, new Customer(3, "Baris"));
        System.out.println(employeesMap);

        //Find basaran and print his information, only changing is integer customer employeesmap
        for (Map.Entry<Integer, Customer> entry: employeesMap.entrySet()){//entryset is always
            Customer iteratedCustomer = entry.getValue();
            if (iteratedCustomer.getName().equalsIgnoreCase("bAsaran")){
                System.out.println(iteratedCustomer);
            }
        }

        //remove basaran...
        ArrayList<Integer> basaransTobeRemoved = new ArrayList<>();
        for (Map.Entry<Integer, Customer> entry: employeesMap.entrySet()){
            Customer iteratedCustomer = entry.getValue();
            if (iteratedCustomer.getName().equalsIgnoreCase("basAran")){
               basaransTobeRemoved.add(entry.getKey());//if we find this key we add it to array!!

            }
        }
        for (Integer key: basaransTobeRemoved){
            employeesMap.remove(key);//removing all basarans gotten in previous loop that added to array
        }//if its done in one loop then:Exception is thrown(cant modify the loop that we are using!!!


        System.out.println(employeesMap);
    }
}
