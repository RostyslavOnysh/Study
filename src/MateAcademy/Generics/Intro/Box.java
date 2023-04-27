package MateAcademy.Generics.Intro;

public class Box {
    private Object value;

    public Box (Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
