package Day01prepinsra.java;
//Armstrong number
public class Qn12 {
    static void main(String[] args) {
        int num=1634;
        int sum=0;
        int original=num;

        int count=0;
        int temp=num;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=num;
        while(temp>0){
            int rem=temp%10;
            sum=(int)(sum+Math.pow(rem,count));
            temp=temp/10;

        }
        if (sum==original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
