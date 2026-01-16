package com.nam.ex6;




import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        System.out.println("Các phần tử duy nhất trong HashSet:");
        for (int num : set) {
            System.out.print(num + " ");
        }

    }
}
