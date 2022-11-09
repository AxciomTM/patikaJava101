import java.util.Scanner;

public class Main {
    static String isPalindrome(String str) {
        String itsTrue = "\"" + str+ "\"" + " kelimesi bir palindromik kelimedir.";
        String itsFalse = "\"" + str+ "\"" + " kelimesi bir palindromik kelime değildir.";

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return itsFalse;
            i++;
            j--;
        }
        return itsTrue;
    }

    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bir kelime giriniz: ");
        String word = girdi.nextLine();
        System.out.println(isPalindrome(word));
    }
}
