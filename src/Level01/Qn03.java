package Level01;

import java.sql.SQLOutput;
import java.util.Scanner;

//Take two numbers as input and print their sum.
public class Qn03 {
    static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter value of A");
        int A=Sc.nextInt();
        System.out.println("Enter value of B");
        int B=Sc.nextInt();

        int Sum=A+B;
        System.out.println(Sum);


    }
}
