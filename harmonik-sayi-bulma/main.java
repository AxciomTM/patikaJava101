import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        double sonuc = 0;
        double sayac = 1;

        do{
            sonuc+=(1/sayac);
            sayac++;

        } while(sayac<=sayi);

        System.out.println(sonuc);
    }
}
