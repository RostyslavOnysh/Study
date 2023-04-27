package MateAcademy.Generics.Intro;



import MateAcademy.Generics.Intro.model.Horse;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String mail = "Hello mates !";
        Box boxMail = new Box(mail);

        Horse horse = new Horse("Ponny",8,"Black");
        Box horseBox = new Box(horse);


        Box<Horse> newHorseBox = new Box<>(horse);
        Horse valueHorse = newHorseBox.getValue();
        System.out.println(valueHorse);

        Box<String> newMailBox = new Box<>(mail);
        String valueMail = newMailBox.getValue();
        System.out.println(valueMail);


    }
}
