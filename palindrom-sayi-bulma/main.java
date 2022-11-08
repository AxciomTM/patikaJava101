import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    static boolean palindromMu(int x){
        int gecici = x ;
        int sayiTers = 0;
        int sonRakam;

        while(gecici != 0){
            sonRakam = gecici % 10;
            sayiTers = (sayiTers*10)+ sonRakam;
            gecici /= 10;

        }
        if(x == sayiTers){
            System.out.println(x+" bir palindrom sayıdır.");
        }
        else{
            System.out.println(x+" bir palindrom sayı değildir.");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        palindromMu(sayi);
    }
}
