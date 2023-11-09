package dip.after_dip;

public class EmailNotification implements Notification  {

    @Override
    public void send(String message) {
         // Send an email
        System.out.println("Sending an email: " + message);
    }
    
}
