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

    public static String dateStr(String str) {
        return str.substring(3,5) + " - " + str.substring(0,2) + " - " + str.substring(6);
    }

    public static String cutOut(String mainStr, String subStr) {
        int index = mainStr.indexOf(subStr);
        String result = mainStr;

        if (index != -1) {
            result = mainStr.substring(0, index);

            if (index != mainStr.length()-3)
                result += mainStr.substring(index+subStr.length());
        }

        return result;
    }

    public static void fooBarBaz(int num1) {
        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("baz ");
            else if (i % 3 == 0)
                System.out.print("foo ");
            else if (i % 5 == 0)
                System.out.print("bar ");
            else
                System.out.print(i + " ");
        }
    }

    // Math Methods


}
