
package com.nam.ex5;


public class EX5 {


public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.addFirst(5);
        queue.addLast(40);

        queue.removeFirst();
        queue.removeLast();

        System.out.println("Danh sách còn lại: " + queue);
    }
}


}

 
