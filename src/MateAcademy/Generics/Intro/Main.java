package MateAcademy.Generics.Intro;

import MateAcademy.src.MateAcademy.JavaCore.Generics.Intro.model.Horse;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String mail = "Hello mates !";
        Box boxMail = new Box(mail);

        Horse horse = new Horse("Ponny",8,"Black");
        Box horseBox = new Box(horse);
        System.out.println(boxMail.getValue());
    }
}
