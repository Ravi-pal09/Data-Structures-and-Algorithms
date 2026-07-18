package Level02;
//Factorial of a Number
public class Qn07 {
    static void main(String[] args) {
        int n=5;
        int fact=1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
            //System.out.println(fact);
        }
        System.out.println(fact);
    }
}
