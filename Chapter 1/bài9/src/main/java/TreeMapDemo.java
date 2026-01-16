import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {


        TreeMap<String, Double> products = new TreeMap<>();


        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Danh sách sản phẩm:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<String, Double> subProducts = products.subMap("K", "N");

        System.out.println("\nSản phẩm từ K đến M:");
        for (Map.Entry<String, Double> entry : subProducts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
