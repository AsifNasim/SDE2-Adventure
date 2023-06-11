import java.util.Scanner;

public class Q1_PrintOneToN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        int count = 1;
        printOneToN(count, n);
    }

    private static void printOneToN(int count, int n) {
        if(count > n){
           return;
        }

        System.out.print(count+ " ");
        count++;
        printOneToN(count, n);
    }
}
