package MateAcademy.JavaBasicExtended.ClassInheritancePrivate;

public class UserAccount {

        private String name;
        private long uniqueNumber;
        private double balance;
        private boolean isVip;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;

        }

    public double getBalance() {
        return balance;
    }

    public void setUniqueNumber(long uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public long getUniqueNumber(){
            return uniqueNumber;
        }

        public void setBalance(double balance){
            this.balance = balance;
        }

        public boolean isVip(){
            return isVip;
        }

        public void setVip(boolean vip) {
            isVip = vip;
        }


    }


