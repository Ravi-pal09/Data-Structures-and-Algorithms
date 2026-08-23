package Day01prepinsra.java;
import java.util.*;

//Positive or negative number
public class Qn01 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if (n>1){
            System.out.println("Postive");

        } else if (n==0) {
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }

    }
}
