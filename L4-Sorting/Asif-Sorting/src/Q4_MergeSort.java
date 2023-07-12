import java.util.Scanner;

public class Q4_MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int lo = 0;
        int hi = arr.length-1;



        mergeSort(arr, lo, hi);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int lo, int hi) {

        if(lo >= hi){
            return;
        }
        int mid = lo + (hi -lo)/2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid+1, hi);

        merging(arr, lo, mid, hi );
    }

    private static void merging(int[] arr, int lo, int mid, int hi) {
        int [] temp = new int[arr.length];
        int left = lo;
        int right = mid+1;
        int index = lo;

        while((left <= mid) && (right <= hi)){
            if(arr[left] < arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        while(left <= mid){
            temp[index] = arr[left];
            left++;
            index++;

        }

        while(right <= hi){
            temp[index]=arr[right];
            right++;
            index++;
        }

        for(int i = lo; i <= hi; i++){
            arr[i] = temp[i];
        }
    }
}
