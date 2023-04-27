package MateAcademy.EqualsAndHashcodeAndClone.Clone;

import java.io.IOException;

public class User implements Cloneable{
    private String name;
    private String LastName;
    private Adress adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", adress=" + adress +
                '}';
    }

    @Override
    public Object clone()  {
        try {
            User clonedUser = (User) super.clone();
            clonedUser.setAdress((Adress) adress.clone());
            return clonedUser;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("Can`t create user clone ",e);
        }

    }
}
