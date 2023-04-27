package MateAcademy.Exception.OwnException;

public class main {

    public static void main(String[] args)
            throws AuthenticationException {
        AuthenticationService service = new AuthenticationService();
        service.authenticate(null, "Hello");
    }
}
