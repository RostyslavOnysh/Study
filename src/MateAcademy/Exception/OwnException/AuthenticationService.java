package MateAcademy.Exception.OwnException;

public class AuthenticationService {
    public void authenticate(String login, String password) throws AuthenticationException{  // та прокидуємо в декларації метода.Попередження що потенційно може виникнути помилка
        //go to db and validate
        // if the password lentght less than 8 symbols - throw an Exception

        if (password.length() < 8) {
            throw new AuthenticationException("User is not authorized"); // в місці де хочемо прокинути помилку створюємо об'ьект нашої помилки
        }
    }
}

