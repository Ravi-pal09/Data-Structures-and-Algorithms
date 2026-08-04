package Day01prepinsra.java;
//Find the Sum of the Numbers in a Given Range
public class Qn06 {
    static void main(String[] args) {
        int num1=12;
        int num2=15;
        System.out.println(sumRange(num1,num2));

    }


    public static int  sumRange(int num1,int num2){
        int sum=0;
        for (int i=num1; i<=num2; i++){
            sum+=i;

        }
        return sum;

    }
}
