import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        int ekok = 0;
        int ebob = 0;
        int sayiEkok;
        int sayiEbob=1;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = girdi.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = girdi.nextInt();
        sayiEkok = sayi1 * sayi2;

        do {
            if (sayiEkok % sayi1 == 0 && sayiEkok % sayi2 == 0) {
                ekok = sayiEkok;
            }
            sayiEkok--;
        } while (sayiEkok > 0);

        do {
            if (sayi1 % sayiEbob == 0 && sayi2 % sayiEbob == 0) {
                ebob = sayiEbob;
            }
            sayiEbob++;
        } while (sayiEbob < sayi1);

        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
