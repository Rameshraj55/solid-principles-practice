package dip;


// import dip.before_dip.EmailNotification;
// import dip.before_dip.NotificationService;
// import dip.before_dip.SMSNotification;
import dip.after_dip.SMSNotification;
import dip.after_dip.EmailNotification;
import dip.after_dip.NotificationService;
import dip.after_dip.Notification;

public class MainDIP {
        public static void main(String[] args) {
            /*
            // BEFORE DEPENDENCY INVERSION PRINCIPLE

                EmailNotification emailNotifier = new EmailNotification();
                SMSNotification smsNotifier = new SMSNotification();
            
                NotificationService notificationService = new NotificationService(emailNotifier, smsNotifier);
                notificationService.sendNotification("i m a message to method", "sms");
           */
           
           // AFTER DEPENDENCY INVERSION PRINCIPLE

                Notification notification;
                SMSNotification smsNotification = new SMSNotification();
                EmailNotification emailNotification = new EmailNotification();
                NotificationService notificationService = new NotificationService(emailNotification);
                notificationService.sendNotification("i m a message to method");






       }
    
    
}
