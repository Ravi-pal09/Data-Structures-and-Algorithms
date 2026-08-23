package Aug05Array;
//2nd way to find max
public class Qn03 {
    static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int ans = max_2(arr);
        System.out.println("Maximum element = " + ans);



    }
    public  static int max_2(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
            max=Math.max(arr[i],max);
        }
        return max;
    }
}
