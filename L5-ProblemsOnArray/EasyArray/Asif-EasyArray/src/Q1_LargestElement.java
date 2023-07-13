import java.util.Arrays;
import java.util.Scanner;

public class Q1_LargestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int largest = largestElem(arr);
        int largestBrute = largestElemBrute(arr);
//        System.out.println(largest);
        System.out.println(largestBrute);
    }

//    Brute Force
//    TC - O(nlogn)
private static int largestElemBrute(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length-1];
}
//    Optimal Solution
//    TC - O(n)
    private static int largestElem(int[] arr) {
        int maxElem = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= maxElem){
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
}
