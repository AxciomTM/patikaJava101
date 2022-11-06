import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Bir Sayı Giriniz :");
        int sayi = girdi.nextInt();
        
        for (int i = sayi-1; i >= 0 ; i--) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
