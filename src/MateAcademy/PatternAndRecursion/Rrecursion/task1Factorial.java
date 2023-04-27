package MateAcademy.PatternAndRecursion.Rrecursion;

public class task1Factorial {
    public int getFactorial(int number) {
        int result = powerof(number);
        return result;
    }

    private static int powerof(int number) {
        if (number == 0) {
            return 1;
        }
        return powerof(number - 1) * number;
    }
}

/*
 public int getFactorial(int number) {
   if (number <= 1) {
     return 1;
    }
  }
        return number * getFactorial (number - 1);
    }
}


 */

