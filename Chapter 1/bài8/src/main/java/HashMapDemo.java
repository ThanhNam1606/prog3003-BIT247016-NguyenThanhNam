import java.util.HashMap;



public class HashMapDemo {
    public static void main(String[] args) {


        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Jack");
        employees.put(102, "ThienAn");
        employees.put(103, "BeSol");

        String name102 = employees.get(102);
        System.out.println("Nhân viên có ID 102: " + name102);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Đã thêm nhân viên ID 105 với tên 'Unknown'");
        }

        System.out.println("Employss list:");
        System.out.println(employees);
    }
}



  
