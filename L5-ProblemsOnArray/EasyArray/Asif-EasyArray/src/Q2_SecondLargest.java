import java.util.Arrays;
import java.util.Scanner;

public class Q2_SecondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int largestBrute = secondLargestElemBrute(arr);
        int largestBetter = secondLargestElemBetter(arr);
        int largestOptimal = secondLargestElemOptimal(arr);

        //        System.out.println(largestBrute);
//        System.out.println(largestBetter);
        System.out.println(largestOptimal);

    }




    /*    Brute Force - TC -> O(nlogn) */
    private static int secondLargestElemBrute(int[] arr) {

        Arrays.sort(arr);
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i-1] < arr[i]){
                return arr[i-1];
            }
        }
        return -1;
    }

//    Better Solution TC - O(n+n)
    private static int secondLargestElemBetter(int[] arr) {
        int maxElem = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= maxElem){
                maxElem = arr[i];
            }
        }
        int secondMaxElem = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMaxElem && arr[i] < maxElem){
                secondMaxElem = arr[i];
            }
        }
        return secondMaxElem;
    }
//    Optimal TC - O(n)
    private static int secondLargestElemOptimal(int[] arr) {
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
