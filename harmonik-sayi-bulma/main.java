import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("N sayısını giriniz: ");
        int sayi = girdi.nextInt();
        double toplam = 0;
        double [] sayilar = new double [sayi];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (double)(1)/(i+1);
        }
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println(toplam);

    }
}
