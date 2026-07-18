package Level02;
//Sum of First N Natural Numbers
public class Qn06 {
    static void main(String[] args) {
        int n=5;
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
