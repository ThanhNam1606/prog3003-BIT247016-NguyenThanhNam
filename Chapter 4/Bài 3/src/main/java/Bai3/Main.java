package Bai3;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        int number = 10;

        System.out.println(number + " là số chẵn? " + isEven.test(number));
    }
}



