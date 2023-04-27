package MateAcademy.CodeWars;


public class GradeBook {

    // main for check how it works
/*
 public static void main(String[] args) {
        int s1 = 50;
        int s2 = 50;
        int s3 = 50;

        char grade =getGrade(s1,s2,s3);
        System.out.println("grade " + grade);
    }
 */


    public static char getGrade(int s1, int s2, int s3) {
        int sum = (s1 + s2 + s3) / 3;
        if (sum >= 90 && sum <= 100) {
            return 'A';
        } else if (sum >= 80 && sum <=90) {
            return 'B';
        } else if (sum >= 70 && sum <=80) {
            return 'C';
        } else if (sum >= 60 && sum <= 70) {
            return 'D';
        } else if (sum >= 0 && sum <=60) {
            return 'F';
        }


        return 0;
    }
}


/*
Grade book
Complete the function so that it finds the average of the three scores passed to it
 and returns the letter value associated with that grade.
 */