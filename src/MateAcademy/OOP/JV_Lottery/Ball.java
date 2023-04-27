package MateAcademy.OOP.JV_Lottery;

public class Ball {
    String color;
    int numbers;

    public Ball(String color, int numbers){
        this.color = color;
        this.numbers = numbers;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
