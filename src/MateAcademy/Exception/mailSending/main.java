package MateAcademy.Exception.mailSending;

public class main {
    public static void main(String[] args) {


        try {
            MailService service = new MailService();
            service.sentMessage(null, null, null);
        } catch (MessageProcessingException | MailServiceException e) {
            System.out.println("Exception");
        }
    }
}