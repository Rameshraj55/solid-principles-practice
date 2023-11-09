package dip.after_dip;

public class NotificationService {
    private static Notification notification;

    /*
     * Now, NotificationService depends on the Notification interface,
     * which can have multiple implementations (e.g., EmailNotification, SMSNotification) without changing the NotificationService class. 
     * This adheres to the Dependency Inversion Principle, 
     * as high-level and low-level modules both depend on abstractions.
     */
    
    public NotificationService() {
       
    }

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message){
        notification.send(message);
    }
    
}
