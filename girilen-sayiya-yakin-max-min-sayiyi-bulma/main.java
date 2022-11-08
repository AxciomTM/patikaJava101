import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: "+ Arrays.toString(list));
        System.out.println("Girilen Sayı: "+sayi);
        Arrays.sort(list);
        int kucuk = list[0];
        int buyuk = list[7];

        for (int j : list) {
            if (j > kucuk && j < sayi) {
                kucuk = j;
            }
        }

        for (int j : list) {
            if (j < buyuk && j > sayi) {
                buyuk = j;
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + kucuk);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + buyuk);

    }
}
