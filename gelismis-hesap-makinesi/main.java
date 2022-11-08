import java.util.Scanner;

public class Main {
private static final Scanner girdi = new Scanner(System.in);
    static void plus() {

        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = girdi.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = girdi.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = girdi.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = girdi.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = girdi.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = girdi.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power() {
        System.out.print("Taban değeri giriniz: ");
        int base = girdi.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = girdi.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        System.out.print("Sayı giriniz: ");
        int n = girdi.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        System.out.print("Sayı giriniz: ");
        int n = girdi.nextInt();
        System.out.print("Alıncak mod: ");
        int m = girdi.nextInt();

        System.out.println("Sonuç: "+n%m);
    }

    static void area() {
        System.out.print("Kısa kenarı giriniz: ");
        int n = girdi.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int m = girdi.nextInt();

        System.out.println("Dikdörtgenin alanı: "+m*n+", dikdörtgenin çevresi: "+(m+n)*2);
    }


    public static void main(String[] args) {
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap
                """;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = girdi.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
