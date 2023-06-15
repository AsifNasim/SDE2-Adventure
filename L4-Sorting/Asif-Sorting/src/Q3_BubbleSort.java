import java.util.Scanner;

public class Q3_BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        bubbleSort(arr);
        displaySortedArray(arr);

    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i >= 0 ; i--) {
            for (int j = 0; j <= i - 1 ; j++) {
                 if(arr[j] > arr[j+1]){
                     swapArr(arr, j, j+1);
                 }
            }
        }
    }

    private static void swapArr(int []arr  ,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void displaySortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
