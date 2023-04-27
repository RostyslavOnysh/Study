package MateAcademy.DailyPlanner;

public class Planner {
    public class DailyPlanner {
        public static String createDailyPlan(String[] plans) {
            if (plans.length == 0) {
                return "My plans:";
            }

            StringBuilder sb = new StringBuilder();
            sb.append("My plans:\n");
            for (int i = 0; i < plans.length; i++) {
                sb.append((i + 1) + ".) " + plans[i]);
                if (i != plans.length - 1) {
                    sb.append(";\n");
                } else {
                    sb.append(";");
                }
            }
            return sb.toString();
        }


        public static void main(String[] args) {
            String[] arrays = {"Hello World Some Word", "Wake up","Meow"};
            String dailyPlan = createDailyPlan(arrays);
            System.out.println(dailyPlan);
        }

    }


/*
This implementation will add a semicolon and a newline character after each item
in the list except for the last item, which will only have a semicolon.
 This should produce the expected output and pass the test.
 */
}
