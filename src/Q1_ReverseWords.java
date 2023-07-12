import java.util.Scanner;

public class Q1_ReverseWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "i.like.this.program.very.much";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str) {

        String [] words = str.split(".");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length-1; i >= 0 ; i--) {
            reversed.append(words[i]);

            if(i > 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
