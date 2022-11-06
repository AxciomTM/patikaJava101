import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi; i++)
        {
            if (sayi % i == 0)
            {
                toplam = i + toplam;
            }
        }
        if (toplam == 2 * sayi)
        {
            System.out.println("Sayı mükemmeldir.");
        }
        else {
            System.out.println("Sayı mükemmel değildir.");
        }

    }
}
