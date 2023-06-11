import java.util.Scanner;

public class Q8_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println(fibonacciNumbers(input));

    }

    private static int fibonacciNumbers(int input) {
        if(input == 0 || input == 1){
            return input;
        }

        return fibonacciNumbers(input-1) + fibonacciNumbers(input-2);
//      int first =fibonacciNumbers(input -1);
//        int last = fibonacciNumbers(input-2);
//        return first + last;
    }
}
