// Zadanie rekrutacyjne
package interview;

public class Palindrom {
    //Palindrom to wyraz czytany od przodu i od tyłu brzmi tak samo np. kajak

    public static boolean isPallindrom(String word) {
        int n = word.length();
        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPallindrom("kajak"));
    }
}
