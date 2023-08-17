package homework3;

import java.util.*;


public class task2 {
    public static void main(String[] args) {
        sortList();
    }
    public static void sortList(){

        List <Integer> number=new ArrayList <Integer>();
     
        number.add(-2);
        number.add(4);
        number.add(19);
        number.add(0);
        number.add(-45);
     
        System.out.println("List: " + number);
     
        number.removeIf(n -> (n & 1) == 0);
     
         Collections.sort(number);
         System.out.println("Sorted List: "+number);
        }
    }
    
