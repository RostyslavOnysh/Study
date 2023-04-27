package MateAcademy.OOP.ClassRandom.DayOfWeekSupplier;

import java.util.Random;

public class DayWeekRandom {
    public ENUMForRandom getRandomDayOfWeek(){
        int index = new Random().nextInt(ENUMForRandom.values().length);
        return ENUMForRandom.values()[index];
    }
}
