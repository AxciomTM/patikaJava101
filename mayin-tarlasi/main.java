import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Oluşturulacak satır sayısı: ");
        int satir = girdi.nextInt();
        System.out.print("Oluşturulacak sütun sayısı: ");
        int sutun = girdi.nextInt();
        MineSweeper oyun = new MineSweeper(satir, sutun);
        oyun.run();
    }
}
