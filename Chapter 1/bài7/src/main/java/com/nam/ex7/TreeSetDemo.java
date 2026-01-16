
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // 1. Tạo TreeSet và thêm các tên
        TreeSet<String> names = new TreeSet<>();
        names.add("JohnWick");
        names.add("ThienAn");
        names.add("Jack");
        names.add("BeSol");

      
        System.out.println("Danh sách trong TreeSet:");
        System.out.println(names);

        String first = names.first(); 
        String last = names.last();  

        System.out.println("Phần tử nhỏ nhất: " + first);
        System.out.println("Phần tử lớn nhất: " + last);
    }
}

    
    
    

  
