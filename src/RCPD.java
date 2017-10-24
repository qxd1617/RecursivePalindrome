public class RCPD {

    public static void main(String args[]){

        String e1 = "airplane";
        String e2 = "reder";
        if (isPalindrome(e1)){
            System.out.printf("%s is a palindrome!", e1);
        }
        if (isPalindrome(e2)){
            System.out.printf("%s is a palindrome!", e2);
        }



    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }
}
