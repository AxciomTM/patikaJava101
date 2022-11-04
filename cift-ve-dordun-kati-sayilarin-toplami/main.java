import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        int sayi;
        int toplam = 0;
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = girdi.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }

        } while (sayi%2==0);
        System.out.println("Sayıların toplamı: "+toplam);
    }
}   
