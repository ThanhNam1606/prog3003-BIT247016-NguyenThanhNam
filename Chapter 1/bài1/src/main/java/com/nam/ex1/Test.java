public class Test<T> {

    // 2. Biến private kiểu T
    private T value;

    // 3. Phương thức set
    public void set(T t) {
        this.value = t;
    }

    // 4. Phương thức get
    public T get() {
        return value;
    }

    // 5. Hàm main để kiểm thử
    public static void main(String[] args) {

        // Test với Integer
        Test<Integer> testInt = new Test<>();
        testInt.set(100);
        System.out.println("Diểm: " + testInt.get());

        // Test với String
        Test<String> testString = new Test<>();
        testString.set("hello boss");
        System.out.println("HP: " + testString.get());
    }
}
