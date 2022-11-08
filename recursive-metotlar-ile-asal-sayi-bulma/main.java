import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayı giriniz: ");
        int sayi = girdi.nextInt();
        System.out.println(sayi+" sayısı "+asalMi(sayi));

    }
    public static String asalMi(int x) {
        boolean asal = true;
        for(int i=2; i<x; i++){
            if (x % i == 0) {
                asal = false;
                break;
            }
        }
        if (asal){
            return "Asaldır!";
        } else {
            return "Asal değildir!";
        }
    }
}
