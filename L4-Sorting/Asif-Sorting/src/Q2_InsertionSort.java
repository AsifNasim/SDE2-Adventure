import java.util.Scanner;

public class Q2_InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        insertionSort(arr);
        displaySortedArray(arr);

    }

    private static void insertionSort(int[] arr) {
//        going through each element of the array
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && (arr[j-1] > arr[j])){
                swapArr(arr, j-1, j);
                j--;
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
