package domain;

public class practice1 {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55};
        // arr[0]  arr[4]

        for (int start=0,end=arr.length-1;start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }





           }
}
