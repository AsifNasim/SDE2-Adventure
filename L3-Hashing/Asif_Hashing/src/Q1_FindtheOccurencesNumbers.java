import java.util.Scanner;

public class Q1_FindtheOccurencesNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

//       PreCompute
        int hashSize = s.nextInt();
        int [] hash = new int[hashSize];
        for (int i = 0; i < hash.length; i++) {
            hash[arr[i]] += 1;
        }

        int q = s.nextInt();
        while (q-- > 0){
            int number = s.nextInt();
            System.out.println(hash[number]);
        }
    }
}
