import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Girilecek sayı adedi: ");
        int adet = girdi.nextInt();
        int sayi, min = 1, maks = 1;

        for(int i = 1; i<=adet; i++){
            System.out.print(i+". sayıyı giriniz:");
            sayi = girdi.nextInt();

            if (i == 1){
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks){
                maks = sayi;
            }

            if (sayi < min){
                min = sayi;
            }
        }

        System.out.println("En büyük sayı: " + maks);
        System.out.println("En küçük sayı: " + min);

    }
}
