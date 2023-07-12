import java.util.Scanner;

public class Q1_CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        int n = s.nextInt();
        int temp = n;
        while (temp > 0){
            int lastDigit = temp%10;
            if((lastDigit != 0) && (lastDigit%2==0)){
                count++;
            }

            temp/=10;
        }
        System.out.println(count);
    }
}
