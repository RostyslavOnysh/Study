package MateAcademy.JavaBasicExtended.ClassInheritancePrivate;

public class AdultUser {
    private String name;
    private int age;
    private boolean isVip;
    private long uniqueNumber;



    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age <18){
            System.out.println("age is less then expected");
        }else {
            this.age = age;
        }
    }

    public String getName (){
        return name;
        }
    public void setName(String name){
        this.name = name;
    }
}
