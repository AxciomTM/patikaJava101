import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = girdi.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = girdi.nextDouble();
        System.out.println("Bir işlem seçiniz.");
        System.out.println("Toplama (1)");
        System.out.println("Çıkarma (2)");
        System.out.println("Bölme (3)");
        System.out.println("Çarpma (4)");
        System.out.print("İşlem numarası: ");
        byte islem = girdi.nextByte();
        switch(islem){
            case 1:
            System.out.println("Sayıların toplamı: "+(num1+num2));
            break;
        }
        switch(islem){
            case 2:
            System.out.println("Sayıların farkı: "+(num1-num2));
            break;
        }
        switch(islem){
            case 3:
            System.out.println("Sayıların bölümü: "+(num1/num2));
            break;
        }
        switch(islem){
            case 4:
            System.out.println("Sayıların çarpımı: "+(num1*num2));
            break;
            default:
                System.out.println("Geçersiz işlem seçtiniz!");
        }

    }
}
