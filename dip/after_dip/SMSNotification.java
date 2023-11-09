package dip.after_dip;

public class SMSNotification implements Notification{

    @Override
    public void send(String message) {
          // Send an SMS
        System.out.println("Sending an SMS: " + message);
    }
    
}
