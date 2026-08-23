package Day01prepinsra.java;
//Fibonacci Series
public class Qn13 {
    static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
