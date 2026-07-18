package Level02;
//Print Even Numbers from 1 to N
public class Qn03 {
    static void main(String[] args) {
        int n=10;

        for (int i=1; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
