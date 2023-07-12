import java.util.Scanner;

public class demo {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] baseArr = new int[size];
        for(int i =0; i < size; i++){
            baseArr[i] = s.nextInt();
        }

        int [] aux = new int[15];

        for(int j = 0; j< baseArr.length; j++){
            aux[baseArr[j]]++;
        }

        for(int k = 1; k< aux.length; k++){
            System.out.println(k+" --> "+ aux[k]);
        }



    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
////        int [] arr = new int[n];
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = s.nextInt();
////        }
////
//////        Brute Force Method
////        for(int j = 0; j< arr.length; j++){
////            int numCount = countOccurence(arr, arr[j]);
////            System.out.println(arr[j] +" appeared " + numCount +" times " );
////        }
//////        Pre-store
////        int [] aux = new int[20];
////        for (int i = 0; i < aux.length; i++) {
////            aux[arr[i]]++;
////        }
////
////
//////        Fetch
////
////        for (int i = 0; i < aux.length; i++) {
////            System.out.print("Occurence of "+i+" is"+ aux[i]);
////        }
//    }

//    private static int countOccurence(int[] arr, int num) {
//        int count =0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num){
//                count++;
//            }
//        }
//        return count;
//    }
}
