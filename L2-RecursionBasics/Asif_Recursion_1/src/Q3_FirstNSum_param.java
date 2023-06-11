import java.util.Scanner;

public class Q3_FirstNSum_param {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        firstNSum_param(input);
    }

    private static void firstNSum_param(int input) {
        int sum = 0;
        int count = 1;
        firstNSum_param(count, sum, input);

    }

    private static void firstNSum_param(int count, int sum, int input) {
        if(count > input){
            System.out.println(sum);
            return ;
        }
        sum += count;
        firstNSum_param(count+1, sum, input);



    }
}
