package MateAcademy.DailyTask;

public class Plant {
    public static int growPlant(int upSpeed, int downSpeed, int desiredHeight) {
        if (upSpeed >= desiredHeight) {
            return 1;
        } else {
            int res = (desiredHeight - upSpeed) / (upSpeed - downSpeed);
            if ((desiredHeight - upSpeed) % (upSpeed - downSpeed) != 0) {
                res++;
            }
                return res + 1;
        }
    }
}


// Method should return 1 if growth during the day is greater than the desired height