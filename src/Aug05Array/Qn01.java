package Aug05Array;
//Linear search algro.
public class Qn01 {
    static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int ser=4;
        System.out.println(search(arr,ser));


    }
    public static int search(int arr[], int ser){
        for (int i=0; i< arr.length; i++){
            if (arr[i]==ser){
                return i;
            }
        }
        return -1;

    }
}
