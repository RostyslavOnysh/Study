package MateAcademy.OOP.Example;

public class Student extends Person{
    private String favouriteSubject;

    public String getFavouriteSubject(){
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject){
        this.favouriteSubject = favouriteSubject;
    }

    @Override
    public String getPersonInfo(){
        return "I am Student. My name is : " + getName();
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
