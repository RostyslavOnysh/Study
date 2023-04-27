package MateAcademy.OOP.JV_OOP;


public class mainApp {
    public static void main(String[] args) {
        Machine[] MachineArray = {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < MachineArray.length; i++) {
            MachineArray[i].doWork();
            MachineArray[i].stopWork();
        }
    }
}
