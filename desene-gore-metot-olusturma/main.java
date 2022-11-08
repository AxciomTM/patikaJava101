import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayı giriniz: ");
        int sayi = girdi.nextInt();
        System.out.print("Çıktısı: ");
        System.out.print(hesapla(sayi));

    }
    public static int hesapla(int x) {
        int sayi = x;
        do{
            System.out.print(x+" ");
            x -= 5;

        } while (x>0);
        do{
            System.out.print(x+" ");
            x += 5;

        } while (x<sayi);
        return x;
    }

}
