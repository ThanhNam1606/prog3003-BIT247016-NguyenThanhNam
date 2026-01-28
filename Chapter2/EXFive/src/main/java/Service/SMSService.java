
package Service;

public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Gửi SMS: " + message);
    }
}
