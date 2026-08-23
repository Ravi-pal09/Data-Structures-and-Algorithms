package Level01;

import java.util.Scanner;

//Find the largest of two numbers.
public class Qn05 {
    static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int A=Sc.nextInt();
        int B= Sc.nextInt();

        if (A>B){
            System.out.println("A is grader"+A);
        }
        else{
            System.out.println("B is grader"+B);
        }
    }
}
