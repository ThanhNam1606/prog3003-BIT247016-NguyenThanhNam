
package com.nam.ex1;

import java.util.*;

class Student {
    String mssv;
    String name;
    double gpa;

    public Student(String mssv, String name, double gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "MSSV: " + mssv + ", Tên: " + name + ", GPA: " + gpa;
    }
}

    public class StudentManager {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showAll();
                case 3 -> searchByName();
                case 4 -> deleteByMSSV();
                case 0 -> {
                    System.out.println("Thoát...");
                    return;
                }
                default -> System.out.println("Sai lựa chọn!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Nhập MSSV: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(id, name, gpa));
        System.out.println("Đã thêm!");
    }

    static void showAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }

    static void searchByName() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = sc.nextLine().toLowerCase();

        for (Student s : list) {
            if (s.name.toLowerCase().contains(keyword)) {
                System.out.println(s);
            }
        }
    }

    static void deleteByMSSV() {
        System.out.print("Nhập MSSV cần xóa: ");
        String id = sc.nextLine();

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().mssv.equals(id)) {
                it.remove();
                System.out.println("Đã xóa!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }
}
