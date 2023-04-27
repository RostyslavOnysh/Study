package MateAcademy.JavaBasicExtended.Switch;

public class CreateExample {
    public static void main(String[] args) {
        String activity = "walking";

        switch (activity) {
            case "math":
            case "physics":
            case "chemistry":
                System.out.println("SCIENCE");
                break;
            case "football":
            case "basketball":
            case "tennis":
                System.out.println("SPORT");
                break;
            case "walking":
            case "watching TV":
                System.out.println("HOBBY");
        }

    }
}
