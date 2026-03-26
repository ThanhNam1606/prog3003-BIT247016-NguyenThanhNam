
package com.nam.bai2;
// Interface
interface MessageService {
    void sendMessage(String message);
}

// Email Service
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMS Service
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Notification class dùng Setter Injection
class Notification {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

// Demo
public class MainApp {
    public static void main(String[] args) {
        Notification notification = new Notification();

        // Dùng Email
        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello via Email!");

        // Dùng SMS
        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello via SMS!");
    }
}