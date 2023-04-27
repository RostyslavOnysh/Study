package MateAcademy.JavaBasicExtended.ClassInheritance;

public class Dog extends Animal{
  public int tailLength;
  private String owner;


  public boolean hasOwner(){
    if (owner == null){
      return false;
    }
    return true;


  }

  public void setOwner(String ownerName){
    owner = ownerName;
  }
}

