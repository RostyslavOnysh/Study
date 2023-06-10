package MateAcademy.DailyTask;

public class FindDivisor {
    public static int countDivisors(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 0; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}


/*
public class FindDivisor {
  public static int countDivisors(int number) {
    int count = 0;
    count = (number > 0) ? countDivisorsHelper(number) : 0;
    return count;
  }

  private static int countDivisorsHelper(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      count += (number % i == 0) ? 1 : 0;
    }
    return count;
  }
}
 */