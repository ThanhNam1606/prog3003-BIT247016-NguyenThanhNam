package com.nam.bai1;



import java.util.TreeSet;

public class Bai1 {
    public static void main(String[] args) {

        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("John");
        nameSet.add("Alice");
        nameSet.add("Zack");
        nameSet.add("Bob");

        System.out.println("=== Danh sách tên (tự động sắp xếp) ===");
        System.out.println(nameSet);

        System.out.println("\nDuyệt từng phần tử:");
        for (String name : nameSet) {
            System.out.println("  - " + name);
        }

        String first = nameSet.first();
        String last  = nameSet.last(); 

        System.out.println("\nPhan tu dau tien (nho nhat): " + first);
        System.out.println("Phan tu cuoi cung (lon nhat): " + last);
    }
}
