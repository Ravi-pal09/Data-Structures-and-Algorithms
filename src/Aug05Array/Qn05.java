package Aug05Array;

import java.util.Scanner;

//index change krna hai bithch se
public class Qn05 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int i=sc.nextInt();
        int j=sc.nextInt();
        reserse(arr,i,j);
        for (int k=0; k< arr.length; k++){
            System.out.println(arr[k]+" ");
        }

    }
    public static void reserse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
}
