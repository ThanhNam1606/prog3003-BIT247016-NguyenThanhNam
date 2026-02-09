package Bai4;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<String> moneyStrings = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convertToInt =
                s -> Integer.parseInt(s.replace("$", ""));

        List<Integer> numbers = new ArrayList<>();

        for (String s : moneyStrings) {
            numbers.add(convertToInt.apply(s));
        }

        System.out.println(numbers);
    }
}


