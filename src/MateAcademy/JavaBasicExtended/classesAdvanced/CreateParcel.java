package MateAcademy.JavaBasicExtended.classesAdvanced;

public class CreateParcel {
    private int weight;
    private int announcedPrice;
    private String sendingDate;
    private String sendersName;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <=0){
            System.out.println("Opps... something went wrong");
        }else {
            this.weight = weight;
        }

    }

    public int getAnnouncedPrice() {
        return announcedPrice;
    }

    public void setAnnouncedPrice(int announcedPrice) {
        if(announcedPrice <=0){
            System.out.println("Opps... something went wrong");
        }else {
            this.announcedPrice = announcedPrice;
        }

    }

    public String getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(String sendingDate) {
        this.sendingDate = sendingDate;
    }

    public String getSendersName() {
        return sendersName;
    }

    public void setSendersName(String sendersName) {
        this.sendersName = sendersName;
    }
}


