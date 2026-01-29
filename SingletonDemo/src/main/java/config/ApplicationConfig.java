package config;

public class ApplicationConfig {

    // Bước 1: Tạo static instance duy nhất
    private static ApplicationConfig instance;

    // Ví dụ các config
    private String appName = "My Demo App";
    private final String version = "1.0.0";

    // Bước 2: Constructor private để chặn tạo đối tượng từ bên ngoài
    private ApplicationConfig() {
        System.out.println("ApplicationConfig initialized!");
    }

    // Bước 3: Hàm public để lấy instance duy nhất (Lazy Initialization)
    public static ApplicationConfig getInstance() {
        if (instance == null) {
            instance = new ApplicationConfig();
        }
        return instance;
    }

    // Getter & Setter config
    public String getAppName() {
        return appName;
    }

    public void setAppName(String name) {
        this.appName = name;
    }

    public String getVersion() {
        return version;
    }
}