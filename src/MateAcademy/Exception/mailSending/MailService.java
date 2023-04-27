package MateAcademy.Exception.mailSending;

public class MailService {
    public void sentMessage(String message, String from, String to)
    throws MailServiceException, MessageProcessingException{
if (from == null || to == null){
    throw new MailServiceException();
}
if (message == null || message.length() > 1000){
    throw new MessageProcessingException();
}
        System.out.println("Sending...");
    }
}
