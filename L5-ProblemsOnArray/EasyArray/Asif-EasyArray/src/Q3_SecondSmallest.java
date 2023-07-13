import java.util.Arrays;
import java.util.Scanner;

public class Q3_SecondSmallest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
//        int secondSmallestBrute = secondSmallestElemBrute(arr);
        int secondSmallestBetter = secondSmallestElemBetter(arr);
//        int secondSmallestOptimal = secondSmallestElemOptimal(arr);

//           System.out.println(secondSmallestBrute);
        System.out.println(secondSmallestBetter);
//        System.out.println(secondSmallestOptimal);

    }

    private static int secondSmallestElemBrute(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i+1] > arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    //    Better Solution TC - O(n+n)
    private static int secondSmallestElemBetter(int[] arr) {
        int minElem = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= minElem){
                minElem = arr[i];
            }
        }
        int secondElem = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < secondElem && arr[i] > minElem){
                secondElem = arr[i];
            }
        }
        return secondElem;
    }
    //    Optimal TC - O(n)
    private static int secondSmallestElemOptimal(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }

        return secondLargest;
    }
}
