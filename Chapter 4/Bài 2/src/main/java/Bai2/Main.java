
package Bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Hanoi",
                "Ho Chi Minh",
                "Da Nang",
                "Hue"
        );

        Collections.sort(cities, (c1, c2) -> c1.length() - c2.length());

        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(cities);
    }
}
