package MateAcademy.DailyTask;

public class Swap {
    public Object[] arguments;

    public Swap(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}


/*
    Object temp = args[0]; // Store the value of args[0]
    args[0] = args[1];
    args[1] = temp; // Assign the stored value to args[1]
  }
 */