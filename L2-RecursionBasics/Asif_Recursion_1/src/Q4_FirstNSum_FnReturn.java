import java.util.Scanner;

public class Q4_FirstNSum_FnReturn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println(firstNSum_FnReturn(input));

    }

    private static int firstNSum_FnReturn(int input) {
        if(input < 0){
            return 0;
        }
        return input + firstNSum_FnReturn(input-1);
    }
}
