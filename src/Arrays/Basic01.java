package Arrays;
//Arrays Basic Class no.11
public class Basic01 {
    static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println(arr);// yha pe addrasing dikhata hai

        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //updation
        int [] other=arr;
        other[2]=-5;

        System.out.println(other[2]);
    }
}
