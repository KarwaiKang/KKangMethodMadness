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

    public static boolean isFibonacci(int num) {
        int previous2 = 0;
        int previous = 1;
        int current = 1;

        while (current < num) {
            current = previous + previous2;
            previous2 = previous;
            previous = current;

            if (current == num)
                return true;
        }

        return false;
    }

    public static void multiplicationTable(int base, int range) {
        for (int i = 0; i <= range; i++)
            System.out.print(base * i + " ");
    }

    public static int sumUpTo(int n) {
        return (n * (n + 1)) / 2;
    }
}
