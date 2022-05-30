public class notificationService {
    
        public static void main(String[] args)
        {
            notificationFactory notificationFactory = new notificationFactory();
            notify notification = notificationFactory.createNotification("EMAIL");
            notification.notifyUser();
        }
    
    
}
