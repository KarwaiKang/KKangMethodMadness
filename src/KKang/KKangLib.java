package KKang;

public class KKangLib {

    // String Methods

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - 1 - i, str.length() - i)))
                return false;
        }

        return true;
    }

    public static String dateStr(String str) {
        return str.substring(3, 5) + " - " + str.substring(0, 2) + " - " + str.substring(6);
    }

    public static String cutOut(String mainStr, String subStr) {
        int i = mainStr.indexOf(subStr);
        String result = mainStr;

        if (i != -1) {
            result = mainStr.substring(0, i);

            if (i != mainStr.length() - 3)
                result += mainStr.substring(i + subStr.length());
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

    public static void primePrinter(int num) {
        int primes = 0;

        for (int n = 2; primes < num; n++) {
            boolean prime = true;

            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0 && n != 2) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(n + " ");
                primes++;
            }
        }
    }
}
