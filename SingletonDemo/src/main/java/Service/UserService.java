package service;

import config.ApplicationConfig;

public class UserService {

    public void printSystemInfo() {
        ApplicationConfig config = ApplicationConfig.getInstance();

        System.out.println("=== System Info ===");
        System.out.println("App Name : " + config.getAppName());
        System.out.println("Version  : " + config.getVersion());
        System.out.println("===================");
    }
}