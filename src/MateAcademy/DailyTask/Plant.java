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
/*
Додав перевірку, якщо upSpeed >= desiredHeight, що означає, що рослині потрібен лише один день, щоб досягти бажаної висоти. Тому повертаємо 1 в цьому випадку.

Якщо upSpeed менше за desiredHeight, то враховуємо, що кожного дня рослина зростає на upSpeed, а вночі зменшується на downSpeed. Тому розраховуємо різницю між desiredHeight і upSpeed, і ділимо її на різницю між upSpeed і downSpeed, щоб отримати кількість днів, коли рослині потрібно для зростання до бажаної висоти.

Якщо розраховане значення не є цілим числом (решта від ділення не дорівнює нулю), то додаємо один день до результату, оскільки рослина ще не досягла бажаної висоти після останнього повного дня зростання.

Нарешті, додаємо 1 до результату, оскільки перший день також враховується у відліку.
 */

// Method should return 1 if growth during the day is greater than the desired height