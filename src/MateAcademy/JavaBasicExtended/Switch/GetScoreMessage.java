package MateAcademy.JavaBasicExtended.Switch;

public class GetScoreMessage {
    public static String getScoreMessage(int place) {

     /*
      if (place == 1) {
            return "Congratulations, you won golden medal";
        } else if (place == 2) {
            return "Great job, you won silver medal";
        } else if (place == 3) {
            return "Cool, you won bronze medal";
        } else {
            return "Don't worry, you'll win next time";
        }
      */
        switch (place) {
            case 1:
                return "Congratulations, you won golden medal";
            case 2:
                return "Great job, you won silver medal";
            case 3:
                return "Cool, you won bronze medal";

            default :
                return "Don't worry, you'll win next time";
        }

    }
}


