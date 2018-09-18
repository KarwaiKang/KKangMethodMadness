package KKang;

public class KKangLib {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (!str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i))) {
                return false;
            }
        }
        return true;
    }
}
