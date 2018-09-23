package KKang;

public class testFile {

    public static void main(String[] args) {
	    System.out.println("\'racecar\' is a palindrome. " + KKangLib.isPalindrome("racecar"));
        System.out.println("\'amanaplanacanalpanama\' is a palindrome. " + KKangLib.isPalindrome(""));
        System.out.println("\'eclair\' is a palindrome. " + KKangLib.isPalindrome("eclair"));

        System.out.println();

        System.out.println("\"01/08/1999\" becomes " + KKangLib.dateStr("01/08/1999"));
        System.out.println("\"07/03/2001\" becomes " + KKangLib.dateStr("07/03/2001"));
        System.out.println("\"04/07/1776\" becomes " + KKangLib.dateStr("04/07/1776"));

        System.out.println();

        System.out.println("\"catatonic cat\" without \"cat\" is " + KKangLib.cutOut("catatonic cat", "cat"));
        System.out.println("\"atonic cat\" without \"cat\" is " + KKangLib.cutOut("atonic cat", "cat"));
        System.out.println("\"dog\" without \"cat\" is " + KKangLib.cutOut("dog", "cat"));
        System.out.println("\"conch shell\" without \"shell\" is " + KKangLib.cutOut("conch shell", "shell"));

        System.out.println();

        KKangLib.fooBarBaz(3);
        KKangLib.fooBarBaz(15);
        KKangLib.fooBarBaz(45);

        System.out.println();

        System.out.println(KKangLib.vigCipher("ATTACKATDAWN", "LEMON"));
        System.out.println(KKangLib.vigCipher("CALLOUTTHESTORM", "PICKLE"));
        System.out.println(KKangLib.vigCipher("THEREARENOBUSESINGENSOKYO", "THEREARE"));

        System.out.println();

        System.out.println("The words \"hello\", \"hola\", and \"nihao\" share " + KKangLib.stringUnion("hello", "hola", "nihao") + " unique letters between at least two of them.");
        System.out.println("The words \"ed\", \"edd\", n \"eddy\" share " + KKangLib.stringUnion("ed", "edd", "eddy") + " unique letters between at least two of them.");
        System.out.println("The words \"red\", \"white\", and \"blue\" share " + KKangLib.stringUnion("red", "white", "blue") + " unique letter between at least two of them.");
        System.out.println("The words \"seven\", \"eight\", and \"nine\" share " + KKangLib.stringUnion("seven", "eight", "nine") + " unique letters between at least two of them.");
        System.out.println("The words \"typewriter\", \"alfalfa\", and \"zzz\" share " + KKangLib.stringUnion("typewriter", "alfalfa", "zzz") + " unique letters between at least two of them.");

        System.out.println();

        System.out.println("5 is a fibonacci number. " + KKangLib.isFibonacci(5));
        System.out.println("55 is a fibonacci number. " + KKangLib.isFibonacci(55));
        System.out.println("144 is a fibonacci number. " + KKangLib.isFibonacci(144));
        System.out.println("10 is a fibonacci number. " + KKangLib.isFibonacci(10));

        System.out.println();

        System.out.print("The products of 5 × n where n equals all integers from 0 to 4: ");
        KKangLib.multiplicationTable(5,4);
        System.out.println();
        System.out.print("The products of 12 × n where n equals all integers from 0 to 10: ");
        KKangLib.multiplicationTable(12,10);
        System.out.println();
        System.out.print("The products of 7 × n where n equals all integers from 0 to 8: ");
        KKangLib.multiplicationTable(7,8);
        System.out.println();

        System.out.println();

        System.out.println("The sum of integers from 1 to 5 is " + KKangLib.sumUpTo(5));
        System.out.println("The sum of integers from 1 to 8 is " + KKangLib.sumUpTo(8));
        System.out.println("The sum of integers from 1 to 58 is " + KKangLib.sumUpTo(58));

        System.out.println();

        System.out.print("The first prime number is: ");
        KKangLib.primePrinter(1);
        System.out.println();
        System.out.print("The first 5 prime numbers are: ");
        KKangLib.primePrinter(5);
        System.out.println();
        System.out.print("The first 25 prime numbers are: ");
        KKangLib.primePrinter(25);
        System.out.println();

        System.out.println();

        System.out.println("The roots of x² are " + KKangLib.quadSolver(1, 0, 0));
        System.out.println("The roots of x² + x are " + KKangLib.quadSolver(1, 1, 0));
        System.out.println("The roots of -x² + 2x + 3 are " + KKangLib.quadSolver(-1, 2, 3));
        System.out.println("The roots of x² + 5 are " + KKangLib.quadSolver(1, 0, 5));
        System.out.println("The roots of 0.5x² - 0.83x - 0.725 are " + KKangLib.quadSolver(.5, -.83, -.725));

        System.out.println();

        System.out.println("The LCM of 3, 4, and 5 is " + KKangLib.leastCommonMultiple(3, 4, 5));
        System.out.println("The LCM of 9, 8, and 7 is " + KKangLib.leastCommonMultiple(9, 8, 7));
        System.out.println("The LCM of 9, 12, and 3 is " + KKangLib.leastCommonMultiple(9, 12, 3));
        System.out.println("The LCM of 5, 50, and 500 is " + KKangLib.leastCommonMultiple(5, 50, 500));
        System.out.println("The LCM of 4, 4, and 4 is " + KKangLib.leastCommonMultiple(4, 4, 4));
    }
}
