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

            if (i != mainStr.length() - subStr.length())
                result += mainStr.substring(i + subStr.length());
        }

        return result;
    }

    public static void fooBarBaz(int num1) {
        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("baz ");
            else if (i % 3 == 0)
                System.out.print("foo ");
            else if (i % 5 == 0)
                System.out.print("bar ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
        The way this works is that it utilizes the ability of characters to be represented by integers as defined in ASCII.
        To cover cases where the key is shorter than the message, modulo of the length of the key ensures no "out of bounds" errors.
        For each character of the message and the corresponding key character, the integer value of the character 'A' is subtracted.
        This lets the value of 'A' be 0 and 'Z' be 25. This is necessary so that a modulo of 26 can be used to roll over 'Z' to 'A'.
        The value of 'A' is then added again so the characters have the correct ASCII value.
        Finally, the 'int' is casted back to a 'char' and concatenated to a new string 'result'.

        CAVEAT: This uses String.charAt().
        CAVEAT: This only works in all caps.
    */

    public static String vigCipher(String message, String key) {
        String result = "";

        for (int i = 0; i < message.length(); i++)
            result += (char) ((((message.charAt(i) - 'A') + (key.charAt(i % key.length()) - 'A')) % 26) + 'A');

        return result;
    }

    public static int stringUnion(String word1, String word2, String word3) {
        String lettersShared = "";

        for (int i = 0; i < word1.length(); i++) {
            String letter = word1.substring(i, i + 1);
            if ((word2.indexOf(letter) != -1 || word3.indexOf(letter) != -1) && lettersShared.indexOf(letter) == -1)
                lettersShared += letter;
        }

        for (int i = 0; i < word2.length(); i++) {
            String letter = word2.substring(i, i + 1);
            if ((word1.indexOf(letter) != -1 || word3.indexOf(letter) != -1) && lettersShared.indexOf(letter) == -1)
                lettersShared += letter;
        }

        for (int i = 0; i < word3.length(); i++) {
            String letter = word3.substring(i, i + 1);
            if ((word1.indexOf(letter) != -1 || word2.indexOf(letter) != -1) && lettersShared.indexOf(letter) == -1)
                lettersShared += letter;
        }

        return lettersShared.length();
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

    // Utilizes the summation formula.

    public static int sumUpTo(int n) {
        return (n * (n + 1)) / 2;
    }

    /*
        Checks if a number n has the factors 2 to the square root of n. If so, it is not prime.

        CAVEAT: Uses Math.sqrt().
    */

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

    // CAVEAT: Uses Math.sqrt().

    public static String quadSolver(double a, double b, double c) {
        double plusRoot = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        double minusRoot = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        if (Double.isNaN(plusRoot))
            return "imaginary.";

        return String.valueOf(plusRoot + ", " + minusRoot);
    }

    /*
        This method is probably not the cleanest or most efficient at all.
        First, the method finds the LCM of 'num1' and 'num2', and then the LCM of that and 'num3'.
        I still don't know if this way is full proof.

        Instead of adding the multiple of the smaller number to itself,
        I add the ratio of the larger to the smaller times the multiple.
        We can tell which number is smaller or larger based on the ratio. (If a / b < 1, a < b)
        In theory, this should be faster in certain cases where the the ratio is 2 or greater.

        For example, 5 vs 51.
        In the old way, 5 would be added to 10 times (+5 +5 +5 +5 +5 +5 +5 +5 +5 +5) before it was larger.
        In the new way, 5 would be added to only 1 time (+(5 * (51 / 5)), or +50).
    */

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int num1Mult = num1;
        int num2Mult = num2;
        int num3Mult = num3;

        while (num1 != num2) {
            if (num2 % num1 == 0) {
                num1 = num2;
                break;
            }
            if (num1 % num2 == 0)
                break;

            int ratio = num1 / num2;

            if (ratio == 0)
                num1 += num2 / num1 * num1Mult;
            else
                num2 += ratio * num2Mult;
        }

        num1Mult = num1;

        while (num1 != num3) {
            if (num3 % num1 == 0) {
                num1 = num3;
                break;
            }
            if (num1 % num3 == 0)
                break;

            int ratio = num1 / num3;

            if (ratio == 0)
                num1 += num3 / num1 * num1Mult;
            else
                num3 += ratio * num3Mult;
        }

        return num1;
    }
}
