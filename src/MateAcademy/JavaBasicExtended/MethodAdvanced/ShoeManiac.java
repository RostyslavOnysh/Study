package MateAcademy.JavaBasicExtended.MethodAdvanced;

public class ShoeManiac {
    private String color;
    private int size;
    //Write code below this line
    public static int shoesNumber;
    //Write code above this line

    public ShoeManiac( String color,int size){
        this.color = color;
        this.size = size;
        shoesNumber++;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


