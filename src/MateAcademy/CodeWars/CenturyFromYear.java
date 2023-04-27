package MateAcademy.CodeWars;

public class CenturyFromYear {
    public static int century(int number) {
        int century = (int) Math.ceil(number / 100.0);
        return century;
    }
}



/*
 public static int century(int number) {
    return (number - 1) / 100 + 1;
  }
}
 */



/*
public static int century(int year) {
    return (year + 99) / 100;
  }
}
 */

          // lox variant
        /*
        if (number >=1 && number <= 101){
            return 1;
        }else if(number >=101 && number <= 200){
            return 2;
        }
        else if(number >=201 && number <= 300){
            return 3;
        }
        else if(number >=301 && number <= 400){
            return 4;
        }else if(number >=401 && number <= 500){
            return 5;
        }else if(number >=501 && number <= 600){
            return 6;
        }else if(number >=601 && number <= 700){
            return 7;
        }else if(number >=701 && number <= 800){
            return 8;
        }else if(number >=801 && number <= 900){
            return 9;
        }else if(number >=901 && number <= 1000){
            return 10;
        }else if(number >=1001 && number <= 1100){
            return 11;
        }else if(number >=1101 && number <= 1200){
            return 12;
        }else if(number >=1201 && number <= 1300){
            return 13;
        }else if(number >=1301 && number <= 1400){
            return 14;
        }else if(number >=1401 && number <= 1500){
            return 15;
        }else if(number >=1501 && number <= 1600){
            return 15;
        }else if(number >=1601 && number <= 1700){
            return 17;
        }else if(number >=1701 && number <= 1800){
            return 18;
        }else if(number >=1801 && number <= 1900){
            return 19;
        }else if(number >=1901 && number <= 2000){
            return 20;
        }
        else if(number >=2001 && number <= 2100){
            return 21;
        }else if(number >=2101 && number <= 2200){
            return 21;
        }
        return number;
    }
}

         */

