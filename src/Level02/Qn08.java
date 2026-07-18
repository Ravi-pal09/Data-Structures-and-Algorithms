package Level02;
//Count the Number of Digits in a Number.
public class Qn08 {
    static void main(String[] args) {
        int x=12345;
        int num=0;

        while(x>0){
            x=x/10;
            num++;
        }
        System.out.println(num);
    }
}
