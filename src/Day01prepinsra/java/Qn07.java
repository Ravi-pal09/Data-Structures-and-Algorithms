package Day01prepinsra.java;
//Leap year or not
public class Qn07 {

    static void main(String[] args) {
        int year=2024;
        leap_year(year);

    }
    public static void leap_year(int year){
        if (year%400==0){
            System.out.println(year+ " Leap Year");
        }
        else if (year%4==0 && year%100!=0){
            System.out.println(year+" leap year");
        }
        else{
            System.out.println(year +" Not a leap year");
        }
    }
}
