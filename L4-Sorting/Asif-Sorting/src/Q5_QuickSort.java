import java.util.Scanner;

public class Q5_QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int lo = 0;
        int hi = arr.length-1;



        quickSort(arr, lo, hi);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int lo, int hi) {

        if (lo < hi) {
            int pIndex = partitonArr(arr, lo, hi);
            quickSort(arr, lo, pIndex-1);
            quickSort(arr, pIndex+1, hi);
        }


    }

    private static int partitonArr(int[] arr, int lo, int hi) {
        int pivotElem = lo;
        int i = lo;
        int j = hi;

        while (i < j){
//            find the element which is higher than pivot and stop the ith index
            while (arr[i] <= arr[pivotElem] && i <= hi-1){
                i++;
            }


//            find the element which is lower than pivot and stop the jth index
            while (arr[j] > arr[pivotElem] && j >= lo){
                j--;
            }

//            check if they have not cross each other
            if(i < j){

                swapArr(arr, i, j);
            }
        }
        swapArr(arr,lo, j);
        return j;
    }

    private static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
