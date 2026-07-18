package Level02;
//Print Odd Numbers from 1 to N
public class Qn04 {
    static void main(String[] args) {
        int n=10;
        int sum=0;

        for (int i=1; i<=10; i+=2){
            System.out.println(i);
            sum++;
        }

        System.out.println("sum is "+sum);
    }
}
