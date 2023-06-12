import java.util.Scanner;

public class Q7_CheckPalindrome {
//    Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

//   Hint :- First Remove all the space and special characters;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        checkPalindrome(str);

    }

    private static void checkPalindrome(String str) {

        String result = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length()-1;
       boolean isPalin =  checkPalindrome(result, start, end);
        System.out.println(isPalin);
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if(start > end){
            return true;
        }

        if(str.charAt(start) ==  str.charAt(end)){
           return checkPalindrome(str, start + 1, end -1);
        }

        return false;

    }
}
