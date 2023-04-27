package MateAcademy.Exception.UserScope;

public class main {
    public static void main(String[] args) {
        String[] records = {"john@gmail.com:78", "rick@yahoo.com:99"};

        userScope uS = new userScope();
        int userScore = uS.getUserScore(records,"greg@gmail.com:20");
        System.out.println(userScore);
    }
}
