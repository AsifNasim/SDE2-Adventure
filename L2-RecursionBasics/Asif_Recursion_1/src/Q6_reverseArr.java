import java.util.Scanner;

public class Q6_reverseArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        reverseArray(arr, start, end );
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if(start > end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end-1);
    }
}
