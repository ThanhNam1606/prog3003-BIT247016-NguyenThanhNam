import service.UserService;
import config.ApplicationConfig;

public class App {
    public static void main(String[] args) {

        // Lấy singleton và chỉnh sửa cấu hình
        ApplicationConfig config = ApplicationConfig.getInstance();
        config.setAppName("Singleton Demo Application");

        // Gọi service
        UserService userService = new UserService();
        userService.printSystemInfo();

        // Kiểm tra Singleton
        ApplicationConfig config2 = ApplicationConfig.getInstance();
        System.out.println("Có phải cùng instance? " + (config == config2)); // true
    }
}