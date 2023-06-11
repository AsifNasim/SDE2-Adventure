import java.util.Scanner;

public class Q2_PrintNtoOne_BT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        printNtoOne_BT(input);
    }

    private static void printNtoOne_BT(int input) {
        printNtoOne_BT(1, input);
    }

    private static void printNtoOne_BT(int i, int input) {
        if(i > input){
            return;
        }

        printNtoOne_BT(i+1,input);
        System.out.print(i+" ");
    }
}
