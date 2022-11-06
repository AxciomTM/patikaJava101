import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        int toplam = 0;
        while(sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Girilen sayının rakamlarının toplamı: " + toplam);
    }
}
