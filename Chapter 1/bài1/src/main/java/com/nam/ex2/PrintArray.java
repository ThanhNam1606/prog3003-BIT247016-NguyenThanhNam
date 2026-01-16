

package com.nam.ex2;

public class PrintArray {

    
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

   
    public static void main(String[] args) {

        
        Integer[] intArray = {110, 221, 33243, 41232, 5124124};

        
        String[] stringArray = {"Hello", "KOnichi'wa", "Nihao"};

        System.out.println("你好:");
        printArray(intArray);

        System.out.println("what's up bro:");
        printArray(stringArray);
    }
}

