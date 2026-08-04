package Day01prepinsra.java;
//Factorial of a Number
public class Qn14 {
    static void main(String[] args) {
        int n=5;
        int fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;

        }
        System.out.println(fact);
    }
}
