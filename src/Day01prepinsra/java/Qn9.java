package Day01prepinsra.java;
//print Prime numbers in a given range
public class Qn9 {
    static void main(String[] args) {
        int n=1234;
        sume(n);
    }
    public static  void sume(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;

        }
        System.out.println(sum);

    }
}
