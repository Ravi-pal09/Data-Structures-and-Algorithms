package Day01prepinsra.java;

import java.util.Scanner;

//Sum of First N Natural numbers
public class Qn03 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;


        for (int i=1; i<=n; i++){

            sum+=i;
            System.out.println(sum);
        }
       // System.out.println(sum);
    }
}
