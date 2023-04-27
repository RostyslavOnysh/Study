package MateAcademy.EqualsAndHashcodeAndClone.Clone;

public class Adress implements Cloneable{
    private String street;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        try {
            return (Adress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("can`t clone adress", e);
        }


    }
}
