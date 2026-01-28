
import Notification.Notification;
import Service.EmailService;
import Service.SMSService;

public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();

        // Gửi bằng Email
        notification.setMessageService(new EmailService());
        notification.send("Xin chào qua Email!");

        // Đổi sang SMS lúc runtime
        notification.setMessageService(new SMSService());
        notification.send("Xin chào qua SMS!");
    }
}
