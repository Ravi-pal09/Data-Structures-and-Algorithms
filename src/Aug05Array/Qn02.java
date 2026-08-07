package Aug05Array;
//Maximum
public class Qn02 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,56,87,6,4,7};
        int max=arr[0];
        System.out.println(maximun(arr,max));

    }
    public static int maximun(int[] arr,int  max){
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
}
