package Day01prepinsra.java;
//Palindrome number
public class Qn11 {
    static void main(String[] args) {
        int num=121;
        int reverse=0;
        int rem=0;
        int original=num;

        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;

        }


        if (original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
