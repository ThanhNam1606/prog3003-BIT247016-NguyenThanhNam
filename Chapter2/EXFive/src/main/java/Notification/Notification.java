
package Notification;

import Service.MessageService;


public class Notification {

    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        if (messageService == null) {
            System.out.println("Chưa có dịch vụ gửi tin!");
            return;
        }
        messageService.sendMessage(message);
    }
}
