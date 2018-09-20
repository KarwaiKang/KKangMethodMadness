package KKang;

public class Main {

    public static void main(String[] args) {
	    System.out.println(KKangLib.isPalindrome("racecar"));
        System.out.println(KKangLib.isPalindrome("eclair"));

        System.out.println(KKangLib.dateStr("01/08/1999"));

        System.out.println(KKangLib.cutOut("catatonic cat", "cat"));
        System.out.println(KKangLib.cutOut("atomic cat", "cat"));

        KKangLib.fooBarBaz(15);
    }
}
