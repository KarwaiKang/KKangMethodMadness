package KKang;

public class testFile {

    public static void main(String[] args) {
	    System.out.println(KKangLib.isPalindrome("racecar"));
        System.out.println(KKangLib.isPalindrome("amanaplanacanalpanama"));
        System.out.println(KKangLib.isPalindrome("eclair"));

        System.out.println(KKangLib.dateStr("01/08/1999"));

        System.out.println(KKangLib.cutOut("catatonic cat", "cat"));
        System.out.println(KKangLib.cutOut("atonic cat", "cat"));
        System.out.println(KKangLib.cutOut("dog", "cat"));

        KKangLib.fooBarBaz(15);

        System.out.println(KKangLib.isFibonacci(5));
        System.out.println(KKangLib.isFibonacci(55));
        System.out.println(KKangLib.isFibonacci(144));
        System.out.println(KKangLib.isFibonacci(10));

        KKangLib.multiplicationTable(5,4);
        System.out.println();
        KKangLib.multiplicationTable(12,10);
        System.out.println();
        KKangLib.multiplicationTable(7,8);
        System.out.println();

        System.out.println(KKangLib.sumUpTo(5));
        System.out.println(KKangLib.sumUpTo(8));
        System.out.println(KKangLib.sumUpTo(58));

        KKangLib.primePrinter(25);
        System.out.println();

        System.out.println("The roots of x^2 are " + KKangLib.quadSolver(1, 0, 0));
        System.out.println("The roots of x^2 + x are " + KKangLib.quadSolver(1, 1, 0));
        System.out.println("The roots of -x^2 + 2x + 3 are " + KKangLib.quadSolver(-1, 2, 3));
        System.out.println("The roots of x^2 + 5 are " + KKangLib.quadSolver(1, 0, 5));
        System.out.println("The roots of 0.5x^2 - 0.83x - 0.725 are " + KKangLib.quadSolver(.5, -.83, -.725));
    }
}
