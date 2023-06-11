import java.util.Scanner;

public class Q5_Factorial_FnReturn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.print(factorial(input));
    }

    private static int factorial(int input) {
        if(input == 1){
            return 1;
        }

        return input* factorial(input - 1);

    }

}
