package MateAcademy.DailyTask;

import jdk.jshell.EvalException;

import java.util.Arrays;

public class Likes {

    public static String whoLikesIt(String[] names) {
        int length = names.length;
        return length == 0 ? "No one likes this"
                : length == 1 ? names[0] + " likes this"
                : length == 2 ? String.join(" and ", names) + " like this"
                : length == 3 ? String.format("%s, %s and %s like this", names[0], names[1], names[2])
                : String.format("%s, %s and %d others like this", names[0], names[1], length - 2);
    }
}


/*
 public static String whoLikesIt(String[] names) {
    int length = names.length;
    switch (length) {
      case 0:
        return "No one likes this";
      case 1:
        return names[0] + " likes this";  .
      case 2:
        return String.join(" and ", names) + " like this";
      case 3:
        return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
      default:
        return String.format("%s, %s and %d others like this", names[0], names[1], length - 2);
    }
  }
}

 */