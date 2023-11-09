package dip.before_dip;

import javax.management.Notification;

public class NotificationService {
    /*
     * In this code, NotificationService directly depends on concrete implementations (EmailNotification and SMSNotification), 
     * violating the Dependency Inversion Principle.
     */
     public EmailNotification emailNotifier;
    public SMSNotification smsNotifier;
    
    public NotificationService(EmailNotification emailNotifier, SMSNotification smsNotifier) {
        this.emailNotifier = new EmailNotification(); // Violation of Dependency Inversion
        this.smsNotifier = new SMSNotification(); // Violation of Dependency Inversion
    }
    public NotificationService(Notification notification) {
    }
    public void sendNotification(String message, String method){
        if (method.equalsIgnoreCase("email")) {
            emailNotifier.sendEmail(message);
        }else if(method.equalsIgnoreCase("sms")){
            smsNotifier.sendSMS(message);
        }
    }
   
    
}
