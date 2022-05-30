public class notificationFactory {
    public notify createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
        case "SMS":
            return new smsNotification();
        case "EMAIL":
            return new emailNotification();
        case "PUSH":
            return new pushNotification();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
