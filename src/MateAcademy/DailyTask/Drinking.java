package MateAcademy.DailyTask;


public class Drinking {
    public static String hydrate(String drinks) {
        int count = 0;
        String[] drinkArr = drinks.split(",\\s*|\\s+and\\s+");

        for (String drink : drinkArr) {
            if (isStandardDrink(drink)) {
                int quantity = extractQuantity(drink);
                count += quantity;
            }
        }

        return count + " glass" + (count != 1 ? "es" : "") + " of water";
    }

    private static boolean isStandardDrink(String drink) {
        return isNumeric(drink.split(" ")[0]);
    }

    private static int extractQuantity(String drink) {
        String[] words = drink.split(" ");
        for (String word : words) {
            if (isNumeric(word)) {
                return Integer.parseInt(word);
            }
        }
        return 0;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}